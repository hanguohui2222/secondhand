package com.iread.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class FileUitil {

	public static Map<String, String> FILE_TYPE_MAP = new HashMap<String, String>();

	public static String checkType(String type, InputStream is) {

		FILE_TYPE_MAP.clear();
		// 判断类型
		if (type.startsWith(FileTypeEnum.audio)) {
			getAudioFileType();
		} else if (type.startsWith(FileTypeEnum.image)) {
			getImageFileType();
		}
		return getTypeByStream(is);
	}

	private static String getTypeByStream(InputStream is) {
		byte[] b = new byte[5];
		String realType = null;
		try {
			// 读取5个文件头字符，不足用
			int bytes = is.read(b, 0, b.length);
			if (bytes == 0) {
				System.out.println("读取文件头信息异常");
			} else {
				// 获取文件头的16进制表示
				String filetypeHex = bytesToHexString(b).toUpperCase();
				Iterator<Entry<String, String>> entryiterator = FILE_TYPE_MAP.entrySet().iterator();
				while (entryiterator.hasNext()) {
					Entry<String, String> entry = entryiterator.next();
					String fileTypeHexValue = entry.getValue().toUpperCase();
					// 对比文件类型
					if (filetypeHex.toUpperCase().startsWith(fileTypeHexValue)) {
						realType = entry.getKey();
					}
				}
			}
		} catch (IOException e) {
			System.out.println("判断文件头格式时文件读取异常");
			e.printStackTrace();
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return realType;
	}

	/**
	 * byte数组转换成16进制字符串
	 * 
	 * @param src
	 * @return
	 */
	private static String bytesToHexString(byte[] src) {
		StringBuilder stringBuilder = new StringBuilder();
		if (src == null || src.length <= 0) {
			return null;
		}
		for (int i = 0; i < src.length; i++) {
			int v = src[i] & 0xFF;
			String hv = Integer.toHexString(v);
			if (hv.length() < 2) {
				stringBuilder.append(0);
			}
			stringBuilder.append(hv);
		}
		return stringBuilder.toString();
	}

	public static void getVideoFileType() {
		FILE_TYPE_MAP.put("ram", "2E7261FD"); // Real Audio (ram)
		FILE_TYPE_MAP.put("rm", "2E524D46"); // Real Media (rm)
		FILE_TYPE_MAP.put("mov", "00000014667479707174"); // Quicktime (mov)
		// FILE_TYPE_MAP.put("rmvb", "2e524d46000000120001"); // rmvb
		FILE_TYPE_MAP.put("avi", "41564920");
		FILE_TYPE_MAP.put("avi", "52494646b440c02b4156");
		FILE_TYPE_MAP.put("flv", "464C5601050000000900");
		FILE_TYPE_MAP.put("mp4", "00000020667479706d70");
		FILE_TYPE_MAP.put("wmv", "3026b2758e66CF11a6d9");
		// FILE_TYPE_MAP.put("3gp", "00000014667479703367");
		FILE_TYPE_MAP.put("mkv", "1a45dfa3010000000000");
	}

	public static void getImageFileType() {
		FILE_TYPE_MAP.put("jpg", "FFD8FF"); // JPEG (jpg)
		FILE_TYPE_MAP.put("png", "89504E47"); // PNG (png)
		FILE_TYPE_MAP.put("gif", "47494638"); // GIF (gif)
		FILE_TYPE_MAP.put("bmp", "424D"); // Windows Bitmap (bmp)
		FILE_TYPE_MAP.put("png", "89504E470D0a1a0a0000"); // PNG (png)
		FILE_TYPE_MAP.put("bmp", "424d228c010000000000"); // 16色位图(bmp)
		FILE_TYPE_MAP.put("bmp", "424d8240090000000000"); // 24位位图(bmp)
		FILE_TYPE_MAP.put("bmp", "424d8e1b030000000000"); // 256色位图(bmp
	}

	public static void getAudioFileType() {
		FILE_TYPE_MAP.put("wav", "57415645"); // Wave (wav)
		FILE_TYPE_MAP.put("mid", "4D546864"); // MIDI (mid)
		FILE_TYPE_MAP.put("mp3", "49443303000000002176");
		FILE_TYPE_MAP.put("wav", "52494646e27807005741");
		FILE_TYPE_MAP.put("aac", "fff1508003fffcda004c");
		FILE_TYPE_MAP.put("wv", "7776706ba22100000704");
		FILE_TYPE_MAP.put("flac", "664c6143800000221200");
	}

	static class FileTypeEnum {
		public static String audio = "audio";
		public static String image = "image";
	}

}
