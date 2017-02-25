
package net.sf.cache4j;

public interface CacheConfig
{

	public Object getCacheId();

	public String getCacheDesc();

	public long getTimeToLive();

	public long getIdleTime();

	public long getMaxMemorySize();

	public int getMaxSize();

	public String getType();

	public String getAlgorithm();

	public String getReference();

}
