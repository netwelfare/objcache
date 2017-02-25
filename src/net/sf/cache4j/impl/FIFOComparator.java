
package net.sf.cache4j.impl;

import java.util.Comparator;

public class FIFOComparator implements Comparator
{

	public int compare(Object o1, Object o2)
	{
		CacheObject co1 = (CacheObject) o1;
		CacheObject co2 = (CacheObject) o2;
		return co1.getCreateTime() < co2.getCreateTime() ? -1
				: co1.getCreateTime() == co2.getCreateTime()
						? (co1.getId() < co2.getId() ? -1 : (co1.getId() == co2.getId() ? 0 : 1)) : 1;
	}

	public boolean equals(Object obj)
	{
		return obj == null ? false : (obj instanceof FIFOComparator);
	}

}
