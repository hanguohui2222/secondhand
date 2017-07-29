package com.iread.utils;

/**
 * string code transform to html
 * @author ${DOM-Buffermaker}
 *
 */
public class HtmlToCodeUtil
{
	public static String htmlToCode(String s)
	{
		if (s != null)
		{
			s = s.replace("\t", "&nbsp;&nbsp;&nbsp;&nbsp;").replace("'", "&acute;").replace(" ", "&nbsp;")
					.replace("\"", "&quot;").replace("\r\n", "<br/>&nbsp;&nbsp;").replace("<","&lt;").replace(">","&gt;")
					.replace("&","&amp;");

		}
		return s;
	}
	
	public static String codeToHtml(String s)
	{
		if (s != null)
		{
			s = s.replace("&amp;", "&").replace("&gt;", ">").replace("&lt;", "<")
			.replace("<br/>&nbsp;&nbsp;", "\n").replace("&quot;", "\"").replace("&nbsp;&nbsp;&nbsp;&nbsp;", "\t")
			.replace("&acute;", "'").replace("&nbsp;", " ");
		}
		
		return s;
	}
}
