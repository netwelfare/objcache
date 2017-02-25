
package net.sf.cache4j;

public interface Cache
{//一般接口都是这样定义的
	public void put(Object objId, Object obj) throws CacheException;

	public Object get(Object objId) throws CacheException;

	public void remove(Object objId) throws CacheException;

	public int size();

	public void clear() throws CacheException;

	public CacheConfig getCacheConfig();

	public CacheInfo getCacheInfo();

}
