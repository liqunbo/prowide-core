/*******************************************************************************
 * Copyright (c) 2016 Prowide Inc.
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as 
 *     published by the Free Software Foundation, either version 3 of the 
 *     License, or (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
 *     
 *     Check the LGPL at <http://www.gnu.org/licenses/> for more details.
 *******************************************************************************/
package com.prowidesoftware.swift.model.mt.mt7xx;



import com.prowidesoftware.Generated;
import java.io.Serializable;

import org.apache.commons.lang.StringUtils;

import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.model.field.*;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.utils.Lib;
import java.io.File;
import java.io.InputStream;
import java.io.IOException;

/**
 * <h1>MT 705 - Pre-Advice of a Documentary Credit</h1>
 * <h3>SWIFT MT705 (ISO 15022) message structure:</h3>
 *
 <div class="scheme"><ul>
<li class="field">Field 40 A (M)</li>
<li class="field">Field 20  (M)</li>
<li class="field">Field 31 D (M)</li>
<li class="field">Field 50  (M)</li>
<li class="field">Field 59  (M)</li>
<li class="field">Field 32 B (M)</li>
<li class="field">Field 39 A (O)</li>
<li class="field">Field 39 B (O)</li>
<li class="field">Field 39 C (O)</li>
<li class="field">Field 41 A,D (O)</li>
<li class="field">Field 44 A (O)</li>
<li class="field">Field 44 E (O)</li>
<li class="field">Field 44 F (O)</li>
<li class="field">Field 44 B (O)</li>
<li class="field">Field 44 C (O)</li>
<li class="field">Field 44 D (O)</li>
<li class="field">Field 45 A (O)</li>
<li class="field">Field 57 A,B,D (O)</li>
<li class="field">Field 79  (O)</li>
<li class="field">Field 72  (O)</li>
</ul></div>

 <style>
.scheme, .scheme ul, .scheme li {
     position: relative;
}
.scheme ul {
    list-style: none;
    padding-left: 32px;
}
.scheme li::before, .scheme li::after {
    content: "";
    position: absolute;
    left: -12px;
}
.scheme li::before {
    border-top: 1px solid #000;
    top: 9px;
    width: 8px;
    height: 0;
}
.scheme li::after {
    border-left: 1px solid #000;
    height: 100%;
    width: 0px;
    top: 2px;
}
.scheme ul > li:last-child::after {
    height: 8px;
}</style>

 *
 * <p>This source code is specific to release <strong>SRU 2017</strong></p> 
 * <p>For additional resources check <a href="http://www.prowidesoftware.com/resources">http://www.prowidesoftware.com/resources</a></p>
 *
 * @author www.prowidesoftware.com
 */
@Generated
public class MT705 extends AbstractMT implements Serializable {
	/**
	 * Constant identifying the SRU to which this class belongs to.
	 */
	public static final int SRU = 2017;
	private static final long serialVersionUID = 1L;
	private static final transient java.util.logging.Logger log = java.util.logging.Logger.getLogger(MT705.class.getName());
	
	/**
	* Constant for MT name, this is part of the classname, after <code>MT</code>
	*/
	public static final String NAME = "705";
	
// begin qualifiers constants	

	/**
	* Constant for qualifier with value IRREVOCABLE 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsI.IRREVOCABLE
	* @see com.prowidesoftware.swift.SchemeConstantsI#IRREVOCABLE
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String IRREVOCABLE = "IRREVOCABLE";

	/**
	* Constant for qualifier with value IRREVOCABLE_STANDBY 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsI.IRREVOCABLE_STANDBY
	* @see com.prowidesoftware.swift.SchemeConstantsI#IRREVOCABLE_STANDBY
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String IRREVOCABLE_STANDBY = "IRREVOCABLE_STANDBY";

	/**
	* Constant for qualifier with value IRREVOCABLE_TRANSFERABLE 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsI.IRREVOCABLE_TRANSFERABLE
	* @see com.prowidesoftware.swift.SchemeConstantsI#IRREVOCABLE_TRANSFERABLE
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String IRREVOCABLE_TRANSFERABLE = "IRREVOCABLE_TRANSFERABLE";

	/**
	* Constant for qualifier with value IRREVOC_TRANS_STANDBY 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsI.IRREVOC_TRANS_STANDBY
	* @see com.prowidesoftware.swift.SchemeConstantsI#IRREVOC_TRANS_STANDBY
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String IRREVOC_TRANS_STANDBY = "IRREVOC_TRANS_STANDBY";

	/**
	* Constant for qualifier with value REVOCABLE 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsR.REVOCABLE
	* @see com.prowidesoftware.swift.SchemeConstantsR#REVOCABLE
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String REVOCABLE = "REVOCABLE";

	/**
	* Constant for qualifier with value REVOCABLE_STANDBY 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsR.REVOCABLE_STANDBY
	* @see com.prowidesoftware.swift.SchemeConstantsR#REVOCABLE_STANDBY
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String REVOCABLE_STANDBY = "REVOCABLE_STANDBY";

	/**
	* Constant for qualifier with value REVOCABLE_TRANSFERABLE 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsR.REVOCABLE_TRANSFERABLE
	* @see com.prowidesoftware.swift.SchemeConstantsR#REVOCABLE_TRANSFERABLE
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String REVOCABLE_TRANSFERABLE = "REVOCABLE_TRANSFERABLE";

// end qualifiers constants	

	/**
	 * Creates an MT705 initialized with the parameter SwiftMessage
	 * @param m swift message with the MT705 content
	 */
	public MT705(SwiftMessage m) {
		super(m);
		sanityCheck(m);
	}

	/**
	 * Creates an MT705 initialized with the parameter MtSwiftMessage.
	 * @param m swift message with the MT705 content, the parameter can not be <code>null</code>
	 * @see #MT705(String)
	 */
	public MT705(MtSwiftMessage m) {
		this();
		super.m = super.getSwiftMessageNotNullOrException();
		sanityCheck(super.m);
	}
	
	/**
	 * Creates an MT705 initialized with the parameter MtSwiftMessage.
	 *
	 * @param m swift message with the MT705 content
	 * @return the created object or <code>null</code> if the parameter is <code>null</code>
	 * @see #MT705(String)
	 * @since 7.7
	 */
	public static MT705 parse(MtSwiftMessage m) {
		if (m == null) {
			return null;
		}
		return new MT705(m.message());
	}
	
	/**
	 * Creates and initializes a new MT705 input message setting TEST BICS as sender and receiver.<br />
	 * All mandatory header attributes are completed with default values.
	 *
	 * @since 7.6
	 */
	public MT705() {
		this(BIC.TEST8, BIC.TEST8);
	}
	
	/**
	 * Creates and initializes a new MT705 input message from sender to receiver.<br />
	 * All mandatory header attributes are completed with default values. 
	 * In particular the sender and receiver addresses will be filled with proper default LT identifier 
	 * and branch codes if not provided,
	 * 
	 * @param sender the sender address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 * @param receiver the receiver address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 * @since 7.7
	 */
	public MT705(final String sender, final String receiver) {
		super(705, sender, receiver);
	}
	
	/**
	* <em>DO NOT USE THIS METHOD</em>
	* It is kept for compatibility but will be removed very soon, since the
	* <code>messageType</code> parameter is actually ignored.
	* 
	* @see #MT705(String, String)
	* @deprecated Use instead <code>new MT705(sender, receiver)</code> instead
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public MT705(final int messageType, final String sender, final String receiver) {
		super(705, sender, receiver);
		com.prowidesoftware.deprecation.DeprecationUtils.phase2(getClass(), "MT705(int, String, String)", "Use the constructor MT705(sender, receiver) instead.");
	}
	
	/**
	 * Creates a new MT705 by parsing a String with the message content in its swift FIN format.<br />
	 * If the fin parameter is null or the message cannot be parsed, the internal message object
	 * will be initialized (blocks will be created) but empty.<br />
	 * If the string contains multiple messages, only the first one will be parsed.
	 *
	 * @param fin a string with the MT message in its FIN swift format
	 * @since 7.7
	 */
	public MT705(final String fin) {
		super();
		if (fin != null) {
			final SwiftMessage parsed = read(fin);
			if (parsed != null) {
				super.m = parsed;
				sanityCheck(parsed);
			}
		}
    }
    
    private void sanityCheck(final SwiftMessage param) {
    	if (param.isServiceMessage()) {
			log.warning("Creating an MT705 object from FIN content with a Service Message. Check if the MT705 you are intended to read is prepended with and ACK.");
		} else if (!StringUtils.equals(param.getType(), getMessageType())) {
			log.warning("Creating an MT705 object from FIN content with message type "+param.getType());
		}
    }
	
	/**
	 * Creates a new MT705 by parsing a String with the message content in its swift FIN format.<br />
	 * If the fin parameter cannot be parsed, the returned MT705 will have its internal message object
	 * initialized (blocks will be created) but empty.<br />
	 * If the string contains multiple messages, only the first one will be parsed. 
	 *
	 * @param fin a string with the MT message in its FIN swift format. <em>fin may be <code>null</code> in which case this method returns null</em>
	 * @return a new instance of MT705 or null if fin is null 
	 * @since 7.7
	 */
	public static MT705 parse(final String fin) {
		if (fin == null) {
			return null;
		}
		return new MT705(fin);
    }
    
    /**
	 * Creates a new MT705 by parsing a input stream with the message content in its swift FIN format, using "UTF-8" as encoding.<br />
	 * If the message content is null or cannot be parsed, the internal message object
	 * will be initialized (blocks will be created) but empty.<br />
	 * If the stream contains multiple messages, only the first one will be parsed.
	 *
	 * @param stream an input stream in UTF-8 encoding with the MT message in its FIN swift format.
	 * @since 7.7
	 */
	public MT705(final InputStream stream) throws IOException {
		this(Lib.readStream(stream));
    }
    
    /**
	 * Creates a new MT705 by parsing a input stream with the message content in its swift FIN format, using "UTF-8" as encoding.<br />
	 * If the stream contains multiple messages, only the first one will be parsed.
	 *
	 * @param stream an input stream in UTF-8 encoding with the MT message in its FIN swift format.
	 * @return a new instance of MT705 or null if stream is null or the message cannot be parsed 
	 * @since 7.7
	 */
	public static MT705 parse(final InputStream stream) throws IOException {
		if (stream == null) {
			return null;
		}
		return new MT705(stream);
    }
    
    /**
	 * Creates a new MT705 by parsing a file with the message content in its swift FIN format.<br />
	 * If the file content is null or cannot be parsed as a message, the internal message object
	 * will be initialized (blocks will be created) but empty.<br />
	 * If the file contains multiple messages, only the first one will be parsed.
	 *
	 * @param file a file with the MT message in its FIN swift format.
	 * @since 7.7
	 */
	public MT705(final File file) throws IOException {
		this(Lib.readFile(file));
    }
    
    /**
	 * Creates a new MT705 by parsing a file with the message content in its swift FIN format.<br />
	 * If the file contains multiple messages, only the first one will be parsed.
	 *
	 * @param file a file with the MT message in its FIN swift format.
	 * @return a new instance of MT705 or null if; file is null, does not exist, can't be read, is not a file or the message cannot be parsed
	 * @since 7.7
	 */
	public static MT705 parse(final File file) throws IOException {
		if (file == null) {
			return null;
		}
		return new MT705(file);
    }
    
	/**
	 * Returns this MT number
	 * @return the message type number of this MT
	 * @since 6.4
	 */
	@Override
	public String getMessageType() {
		return "705";
	}
	
	/**
	 * Add all tags from block to the end of the block4.
	 *
	 * @param block to append
	 * @return this object to allow method chaining
	 * @since 7.6
	 */
	@Override
	public MT705 append(final SwiftTagListBlock block) {
		super.append(block);
		return this;
	}
	
	/**
	 * Add all tags to the end of the block4.
	 *
	 * @param tags to append
	 * @return this object to allow method chaining
	 * @since 7.6
	 */
	@Override
	public MT705 append(final Tag ... tags) {
		super.append(tags);
		return this;
	}
	
	/**
	 * Add all the fields to the end of the block4.
	 *
	 * @param fields to append
	 * @return this object to allow method chaining
	 * @since 7.6
	 */
	@Override
	public MT705 append(final Field ... fields) {
		super.append(fields);
		return this;
	}

    /**
	 * Creates an MT705 messages from its JSON representation.
	 * <p>
	 * For generic conversion of JSON into the corresopnding MT instance
	 * see {@link AbstractMT#fromJson(String)}
	 *
	 * @param json a JSON representation of an MT705 message
	 * @return a new instance of MT705
	 * @since 7.10.2
	 */
	public final static MT705 fromJson(String json) {
		return (MT705) AbstractMT.fromJson(json);
	}

	/**
	 * Iterates through block4 fields and return the first one whose name matches 40A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 40A at MT705 is expected to be the only one.
	 * 
	 * @return a Field40A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field40A getField40A() {
		final Tag t = tag("40A");
		if (t != null) {
			return new Field40A(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 20, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 20 at MT705 is expected to be the only one.
	 * 
	 * @return a Field20 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field20 getField20() {
		final Tag t = tag("20");
		if (t != null) {
			return new Field20(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 31D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 31D at MT705 is expected to be the only one.
	 * 
	 * @return a Field31D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field31D getField31D() {
		final Tag t = tag("31D");
		if (t != null) {
			return new Field31D(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 50, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 50 at MT705 is expected to be the only one.
	 * 
	 * @return a Field50 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field50 getField50() {
		final Tag t = tag("50");
		if (t != null) {
			return new Field50(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 59, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 59 at MT705 is expected to be the only one.
	 * 
	 * @return a Field59 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field59 getField59() {
		final Tag t = tag("59");
		if (t != null) {
			return new Field59(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 32B, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 32B at MT705 is expected to be the only one.
	 * 
	 * @return a Field32B object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field32B getField32B() {
		final Tag t = tag("32B");
		if (t != null) {
			return new Field32B(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 39A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 39A at MT705 is expected to be the only one.
	 * 
	 * @return a Field39A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field39A getField39A() {
		final Tag t = tag("39A");
		if (t != null) {
			return new Field39A(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 39B, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 39B at MT705 is expected to be the only one.
	 * 
	 * @return a Field39B object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field39B getField39B() {
		final Tag t = tag("39B");
		if (t != null) {
			return new Field39B(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 39C, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 39C at MT705 is expected to be the only one.
	 * 
	 * @return a Field39C object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field39C getField39C() {
		final Tag t = tag("39C");
		if (t != null) {
			return new Field39C(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 41A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 41A at MT705 is expected to be the only one.
	 * 
	 * @return a Field41A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field41A getField41A() {
		final Tag t = tag("41A");
		if (t != null) {
			return new Field41A(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 41D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 41D at MT705 is expected to be the only one.
	 * 
	 * @return a Field41D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field41D getField41D() {
		final Tag t = tag("41D");
		if (t != null) {
			return new Field41D(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 44A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 44A at MT705 is expected to be the only one.
	 * 
	 * @return a Field44A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field44A getField44A() {
		final Tag t = tag("44A");
		if (t != null) {
			return new Field44A(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 44E, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 44E at MT705 is expected to be the only one.
	 * 
	 * @return a Field44E object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field44E getField44E() {
		final Tag t = tag("44E");
		if (t != null) {
			return new Field44E(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 44F, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 44F at MT705 is expected to be the only one.
	 * 
	 * @return a Field44F object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field44F getField44F() {
		final Tag t = tag("44F");
		if (t != null) {
			return new Field44F(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 44B, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 44B at MT705 is expected to be the only one.
	 * 
	 * @return a Field44B object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field44B getField44B() {
		final Tag t = tag("44B");
		if (t != null) {
			return new Field44B(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 44C, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 44C at MT705 is expected to be the only one.
	 * 
	 * @return a Field44C object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field44C getField44C() {
		final Tag t = tag("44C");
		if (t != null) {
			return new Field44C(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 44D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 44D at MT705 is expected to be the only one.
	 * 
	 * @return a Field44D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field44D getField44D() {
		final Tag t = tag("44D");
		if (t != null) {
			return new Field44D(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 45A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 45A at MT705 is expected to be the only one.
	 * 
	 * @return a Field45A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field45A getField45A() {
		final Tag t = tag("45A");
		if (t != null) {
			return new Field45A(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 57A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 57A at MT705 is expected to be the only one.
	 * 
	 * @return a Field57A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field57A getField57A() {
		final Tag t = tag("57A");
		if (t != null) {
			return new Field57A(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 57B, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 57B at MT705 is expected to be the only one.
	 * 
	 * @return a Field57B object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field57B getField57B() {
		final Tag t = tag("57B");
		if (t != null) {
			return new Field57B(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 57D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 57D at MT705 is expected to be the only one.
	 * 
	 * @return a Field57D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field57D getField57D() {
		final Tag t = tag("57D");
		if (t != null) {
			return new Field57D(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 79, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 79 at MT705 is expected to be the only one.
	 * 
	 * @return a Field79 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field79 getField79() {
		final Tag t = tag("79");
		if (t != null) {
			return new Field79(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 72, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 72 at MT705 is expected to be the only one.
	 * 
	 * @return a Field72 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field72 getField72() {
		final Tag t = tag("72");
		if (t != null) {
			return new Field72(t.getValue());
		} else {
			return null;
		}
	}
	



}
