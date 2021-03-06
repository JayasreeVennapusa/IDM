package TTANNOTATIONS;


/**
 *	Generated from IDL definition of struct "ANNOT_Subpage_t"
 *	@author JacORB IDL compiler 
 */

public final class ANNOT_Subpage_tHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(TTANNOTATIONS.ANNOT_Subpage_tHelper.id(),"ANNOT_Subpage_t",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("subpageId", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(2)), null),new org.omg.CORBA.StructMember("annotSeq", TTANNOTATIONS.AnnotationSeqHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final TTANNOTATIONS.ANNOT_Subpage_t s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static TTANNOTATIONS.ANNOT_Subpage_t extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:TTANNOTATIONS/ANNOT_Subpage_t:1.0";
	}
	public static TTANNOTATIONS.ANNOT_Subpage_t read (final org.omg.CORBA.portable.InputStream in)
	{
		TTANNOTATIONS.ANNOT_Subpage_t result = new TTANNOTATIONS.ANNOT_Subpage_t();
		result.subpageId=in.read_short();
		result.annotSeq = TTANNOTATIONS.AnnotationSeqHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final TTANNOTATIONS.ANNOT_Subpage_t s)
	{
		out.write_short(s.subpageId);
		TTANNOTATIONS.AnnotationSeqHelper.write(out,s.annotSeq);
	}
}
