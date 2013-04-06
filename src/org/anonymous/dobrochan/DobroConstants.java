package org.anonymous.dobrochan;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DobroConstants {
	public static final String ALARM_INTENT = "ALARM";
	public static final String DISALARM_INTENT = "DISALARM";
	public static final String NEXT = "NEXT";
	public static final String BOARD = "BOARD_NAME";
	public static final String SCHROLL_TO = "SCHROLL_TO";
	public static final String DISABLE_UPDATE = "DISABLE_UPDATE";
	public static final String THREAD = "THREAD_DISPLAY_ID";
	public static final String THREAD_ID = "THREAD_ID";
	public static final String POST = "POST_DISPLAY_ID";
	public static final String TITLE = "TITLE";
	public static final String COUNT = "COUNT";
	public static final String LAST = "LAST";
	public static final String FAVS_DUMP = "FAVS_DUMP";
	public static final String FAVS_TITLES = "FAVS_TITLES";
	public static final String DOMAIN = "dobrochan.ru";
	public static final String HOST = "http://" + DOMAIN + "/";
	public static final String API_DIFF = HOST + "api/chan/stats/diff.json";
	public static final String API_DET_POST      = HOST + "api/post/%s/%s.json?new_format&message_html";
	public static final String API_THREAD_INFO   = HOST + "api/thread/%s/last.json?new_format&count=1";
	public static final String API_FULL_THREAD   = HOST + "api/thread/%s/all.json?new_format&message_html";
	public static final String API_NEW_POSTS     = HOST + "api/thread/%s/new.json?new_format&last_post=%s&message_html"; 
	public static final String API_COUNT_POSTS   = HOST + "api/thread/%s/last.json?new_format&count=%s&message_html";
	public static final String API_HIDE_THREAD   = HOST + "api/thread/%s/%s/hide.json";
	public static final String API_UNHIDE_THREAD = HOST + "api/thread/%s/%s/unhide.json";
	public static final String API_FAV_THREAD    = HOST + "api/thread/%s/%s/sign.json";
	public static final String API_UNFAV_THREAD  = HOST + "api/thread/%s/%s/unsign.json";
	public static final String API_SESSION_INFO  = HOST + "api/user.json?new_format";
	//public static final String API_THREADS_INFO  = HOST + "api/user.json?threads&new_format";
	public static final String API_HIDDEN_INFO  = HOST + "api/user.json?threads&new_format&thread-level=hidden";
	public static final String API_FAVS_INFO  = HOST + "api/user.json?threads&new_format&thread-level=bookmarked";
	public static final String API_BOARD  		 = HOST + "%s/%s.json?new_format";
	public static final String API_DEL_POST		 = HOST + "%s/delete";
	public static final String APP_DIR = "%s/Android/data/org.anonymous.dobrochan/";
	public static final String TEMP_COMMON = APP_DIR + "temp/";
	public static final String TEMP_FILE = TEMP_COMMON + "%s.%s";
	public static final String BANNERS_DIR = APP_DIR + "banners/";
	public static final String DEFAULT_UA = "Android-%s-%s - Mozilla/5.0 (Linux; U; Android %s; en-us; %s) DobroReader/%s (JSON)";
	public static final String POST_NEW = HOST+"%s/post/new.xhtml";
	/*public static final String DCOTT  = "ba92f8660044c3627aa7624020a31030";*/
	public static final String PICRELATED_BACKGROUND = "#10FFFFFF";
	public static final String POST_TAG = "POST";
	public static final String UPDATE_TAG = "UPDATE";
	public static final String HIDDEN_TAG = "HIDDEN";
	public static final String REPLY_TO = "Ответ в >>%s/%s";
	public static final String COOKIE_FILE = "hanabira.txt";
	public static final String COOKIE_KEY = "hanabira";
	public static final String LAST_MOD = "ETag";
	public static final String IF_MOD = "If-None-Match";
	public static final String THREAD_MODIFIED = "THREAD_MODIFIED";
	public static final String AUTOCHECK = "AUTOCHECK";
	public static final Integer NOTIFY_ID = 13;
	public static final Integer DOWNLOAD_ID = 14;
	public static final Integer ANSWER_RESULT = 57;
	public static final String RESIZER_URL = "http://image-resize.appspot.com/?url=%s&width=%s&height=%s";
	public static Map<Integer, String> BOARD_ID_TO_NAME;
	static {
		Map<Integer, String> temp = new HashMap<Integer, String>();
		temp.put(1, "b");
		temp.put(15, "u");
		temp.put(25, "rf");
		temp.put(28, "dt");
		temp.put(18, "vg");
		temp.put(8, "r");
		temp.put(9, "cr");
		temp.put(10, "lor");
		temp.put(11, "mu");
		temp.put(12, "oe");
		temp.put(24, "s");
		temp.put(5, "w");
		temp.put(6, "hr");
		temp.put(7, "a");
		temp.put(26, "ma");
		temp.put(13, "sw");
		temp.put(14, "hau");
		temp.put(19, "azu");
		temp.put(38, "tv");
		temp.put(33, "cp");
		temp.put(16, "gf");
		temp.put(17, "bo");
		temp.put(30, "di");
		temp.put(20, "vn");
		temp.put(21, "ve");
		temp.put(22, "wh");
		temp.put(23, "fur");
		temp.put(27, "to");
		temp.put(32, "bg");
		temp.put(31, "wn");
		temp.put(36, "slow");
		temp.put(37, "mad");
		temp.put(2, "d");
		temp.put(3, "news");
		BOARD_ID_TO_NAME = Collections.unmodifiableMap(temp);
	}
	
	//old unused
	public static final String THREADS_CACHE = APP_DIR + "threads/";
	public static final String THREADS_INFO_CACHE = APP_DIR + "threads_info/";
}
