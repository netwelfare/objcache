
package net.sf.cache4j;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import net.sf.cache4j.impl.Configurator;

public class CacheFactory
{

	private Map _cacheMap;

	private CacheCleaner _cleaner;

	private static final CacheFactory _cacheFactory = new CacheFactory();

	public CacheFactory()
	{
		_cacheMap = new HashMap();
		_cleaner = new CacheCleaner(30000); //default 30sec
		_cleaner.start();
	}

	public static CacheFactory getInstance()
	{
		return _cacheFactory;
	}

	public void loadConfig(InputStream in) throws CacheException
	{
		Configurator.loadConfig(in);
	}

	public void addCache(Cache cache) throws CacheException
	{
		if (cache == null)
		{
			throw new NullPointerException("cache is null");
		}
		CacheConfig cacheConfig = cache.getCacheConfig();
		if (cacheConfig == null)
		{
			throw new NullPointerException("cache config is null");
		}
		if (cacheConfig.getCacheId() == null)
		{
			throw new NullPointerException("config.getCacheId() is null");
		}
		if (!(cache instanceof Cache))
		{
			throw new CacheException("cache not instance of " + ManagedCache.class.getName());
		}

		synchronized (_cacheMap)
		{
			if (_cacheMap.containsKey(cacheConfig.getCacheId()))
			{
				throw new CacheException("Cache id:" + cacheConfig.getCacheId() + " exists");
			}

			_cacheMap.put(cacheConfig.getCacheId(), cache);
		}
	}

	public Cache getCache(Object cacheId) throws CacheException
	{
		if (cacheId == null)
		{
			throw new NullPointerException("cacheId is null");
		}

		synchronized (_cacheMap)
		{
			return (Cache) _cacheMap.get(cacheId);
		}
	}

	public void removeCache(Object cacheId) throws CacheException
	{
		if (cacheId == null)
		{
			throw new NullPointerException("cacheId is null");
		}

		synchronized (_cacheMap)
		{
			_cacheMap.remove(cacheId);
		}
	}

	public Object[] getCacheIds()
	{
		synchronized (_cacheMap)
		{
			return _cacheMap.keySet().toArray();
		}
	}

	public void setCleanInterval(long time)
	{
		_cleaner.setCleanInterval(time);
	}

}
