
package net.sf.cache4j;

public interface ManagedCache
{ //set了一个方法而已
	public void setCacheConfig(CacheConfig config) throws CacheException;

	public void clean() throws CacheException;

}
