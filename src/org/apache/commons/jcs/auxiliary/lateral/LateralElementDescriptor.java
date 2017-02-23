package org.apache.commons.jcs.auxiliary.lateral;

import java.io.Serializable;

import org.apache.commons.jcs.engine.behavior.ICacheElement;

/**
 * This class wraps command to other laterals. It is essentially a
 * JCS-TCP-Lateral packet. The headers specify the action the receiver should
 * take. ¶ÔElementµÄ·â×°
 */
public class LateralElementDescriptor<K, V> implements Serializable
{
	/** Don't change */
	private static final long serialVersionUID = 5268222498076063575L;

	/** The Cache Element that we are distributing. */
	public ICacheElement<K, V> ce;

	/**
	 * The id of the the source of the request. This is used to prevent infinite
	 * loops.
	 */
	public long requesterId;

	/** The operation has been requested by the client. */
	public LateralCommand command = LateralCommand.UPDATE;

	/**
	 * The hashcode value for this element.
	 */
	public int valHashCode = -1;

	/** Constructor for the LateralElementDescriptor object */
	public LateralElementDescriptor()
	{
		super();
	}

	/**
	 * Constructor for the LateralElementDescriptor object
	 * <p>
	 * @param ce ICacheElement<K, V> payload
	 */
	public LateralElementDescriptor(ICacheElement<K, V> ce)
	{
		this.ce = ce;
	}

	/**
	 * @return String, all the important values that can be configured
	 */
	@Override
	public String toString()
	{
		StringBuilder buf = new StringBuilder();
		buf.append("\n LateralElementDescriptor ");
		buf.append("\n command = [" + this.command + "]");
		buf.append("\n valHashCode = [" + this.valHashCode + "]");
		buf.append("\n ICacheElement = [" + this.ce + "]");
		return buf.toString();
	}
}
