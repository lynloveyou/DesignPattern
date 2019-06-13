package com.lyn.test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {

	public static void main(String[] args) {
		String decodestr = "开心100%";
/*		try {
			System.out.println(URLDecoder.decode(decodestr, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}*/
		Pattern compile = Pattern.compile("%\\w{2}%\\w{2}");
		Matcher matcher = compile.matcher(decodestr);
		System.out.println(matcher.find());
		matcher = compile.matcher("测试一下");
		System.out.println(matcher.find());
		
		String a = "123";
		replace(a);
		System.out.println("--change--"+a);
		
		System.out.println(URLEncoder.encode("君山"));
		System.out.println(URLDecoder.decode(URLDecoder.decode("%25E5%2590%259B%25E5%25B1%25B1")));
		
		String replacestr="123ab456ab456ab";
		System.out.println(replacestr.replace("ab", "cd"));
		System.out.println(replacestr.replaceAll("ab", "cd"));
		
		String regx = "/admin/service/wxcomponent/message_and_event/\\w*\\W*/\\w*\\W*";
		String url ="/admin/service/wxcomponent/message_and_event/accept_message_and_event/123";
		System.out.println(url.matches(regx));
		assert false?false:true;
		System.out.println(String.class.getName());
		System.out.println(String.class.getSimpleName());
		String str = "0|90000005";
		System.out.println(str.replaceAll("\\|", ""));
		
		
	}
	public static void replace(String a)
	{
		a= "789";
		System.out.println(a);
	}

}
