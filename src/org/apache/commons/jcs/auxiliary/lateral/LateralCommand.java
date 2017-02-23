package org.apache.commons.jcs.auxiliary.lateral;

/**
 * Enumeration of the available lateral commands √¸¡Ó––
 */
public enum LateralCommand
{
	/** The command for updates */
	UPDATE,

	/** The command for removes */
	REMOVE,

	/** The command instructing us to remove all */
	REMOVEALL,

	/** The command for disposing the cache. */
	DISPOSE,

	/** Command to return an object. */
	GET,

	/** Command to return an object. */
	GET_MATCHING,

	/** Command to get all keys */
	GET_KEYSET
}
