package TTLIBRARY;


/**
 *	Generated from IDL definition of struct "NameValue"
 *	@author JacORB IDL compiler 
 */

public final class NameValueHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(TTLIBRARY.NameValueHelper.id(),"NameValue",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("mName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("mValue", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final TTLIBRARY.NameValue s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static TTLIBRARY.NameValue extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:TTLIBRARY/NameValue:1.0";
	}
	public static TTLIBRARY.NameValue read (final org.omg.CORBA.portable.InputStream in)
	{
		TTLIBRARY.NameValue result = new TTLIBRARY.NameValue();
		result.mName=in.read_string();
		result.mValue=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final TTLIBRARY.NameValue s)
	{
		out.write_string(s.mName);
		out.write_string(s.mValue);
	}
}