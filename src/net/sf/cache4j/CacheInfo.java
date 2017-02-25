
package net.sf.cache4j;

public interface CacheInfo
{

	public long getCacheHits();

	public long getCacheMisses();

	public long getTotalPuts();

	public long getTotalRemoves();

	public void reset();

	public long getMemorySize();

}
