
package net.sf.cache4j.impl;

import net.sf.cache4j.Cache;
import net.sf.cache4j.CacheConfig;
import net.sf.cache4j.CacheException;
import net.sf.cache4j.CacheInfo;
import net.sf.cache4j.ManagedCache;

public class EmptyCache implements Cache, ManagedCache
{

	private CacheConfigImpl _config;

	private CacheInfo _cacheInfo;

	public void put(Object objId, Object obj) throws CacheException
	{
		if (objId == null)
		{
			throw new NullPointerException("objId is null");
		}
	}

	public Object get(Object objId) throws CacheException
	{
		if (objId == null)
		{
			throw new NullPointerException("objId is null");
		}
		return null;
	}

	public void remove(Object objId) throws CacheException
	{
		if (objId == null)
		{
			throw new NullPointerException("objId is null");
		}
	}

	public int size()
	{
		return 0;
	}

	public void clear() throws CacheException
	{
	}

	public CacheInfo getCacheInfo()
	{
		return _cacheInfo;
	}

	public CacheConfig getCacheConfig()
	{
		return _config;
	}

	public void setCacheConfig(CacheConfig config)
	{
		if (config == null)
		{
			throw new NullPointerException("config is null");
		}
		_config = (CacheConfigImpl) config;
		_cacheInfo = new CacheInfoImpl();
	}

	public void clean() throws CacheException
	{
	}

	private class CacheInfoImpl implements CacheInfo
	{
		public long getCacheHits()
		{
			return 0;
		}

		public long getCacheMisses()
		{
			return 0;
		}

		public long getTotalPuts()
		{
			return 0;
		}

		public long getTotalRemoves()
		{
			return 0;
		}

		public void reset()
		{

		}

		public long getMemorySize()
		{
			return 0;
		}

		public String toString()
		{
			return "hit:0 miss:0 memorySize:0";
		}
	}
}
