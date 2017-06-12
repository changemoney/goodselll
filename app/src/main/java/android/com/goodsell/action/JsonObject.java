package android.com.goodsell.action;

import android.text.TextUtils;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonObject {
    private String A;
    private String B;
    private String C;
    private String D;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;
    public int g;
    public int h;
    public int i;
    //public c j;
    public boolean k;
    public String l;
    public int m;
    public int n;
    public String o;
    public String p;
    public String q;
    public String r;
    public int s;
    public int t;
    public String u;
    public String v;
    public String w;
    public String x;
    private int y;
    private String z;

    public JsonObject (JSONObject arg7) {
        JSONObject v1_1;
        int v5 = 5;
        //super();
        this.b = "";
        this.c = "";
        this.d = "";
        this.f = 0;
        this.h = 1;
        this.i = 0;
        this.k = false;
        if(arg7 != null) {
            this.b = arg7.optString("jump_url");
            this.c = arg7.optString("img_url");
            this.a = arg7.optString("id");
            this.A = arg7.optString("icon_url");
            this.d = arg7.optString("title");
            this.e = arg7.optString("id");
            this.z = arg7.optString("content");
            this.f = arg7.optInt("is_login");
            this.y = arg7.optInt("banner_type");
            this.g = arg7.optInt("loop_time");
            this.h = arg7.optInt("open_mode");
            this.B = arg7.optString("created");
            this.C = arg7.optString("begin_time");
            this.D = arg7.optString("end_time");
            String v0 = arg7.optString("jump_data");
            if(!TextUtils.isEmpty(((CharSequence)v0))) {
                try {
                    v1_1 = new JSONObject(v0);
                    this.i = v1_1.optInt("wap_login");
                    this.u = v1_1.optString("virture_id");
                    this.t = v1_1.optInt("tool_id", 0);
                    this.x = arg7.optString("trace_extra_from");
                    JSONObject v2 = v1_1.optJSONObject("topic");
                    JSONObject v3 = v1_1.optJSONObject("filter_param");
                    JSONObject v4 = v1_1.optJSONObject("search_condition");
                    if(v2 != null) {
                        this.r = v2.toString();
                    }

                    if(v3 != null) {
                        this.q = arg7.optString("filter_param");
                    }

                    if(v4 != null) {
                        this.s = v4.optInt("show_type", 0);
                    }

                    this.v = v1_1.optString("sence");
                    v1_1 = v1_1.optJSONObject("extend");
//                    if(v1_1 == null) {
//                        goto label_103;
//                    }

                    this.w = v1_1.optString("id");
                }
                catch(JSONException v1) {
                }
            }

            //label_103:
            int v1_2 = 1001;//m.b(this.b, -1);
            if(this.h == v5 && v1_2 > 1000 && !TextUtils.isEmpty(((CharSequence)v0))) {
                try {
                    v1_1 = new JSONObject(v0);
                    if(v1_1 != null) {
                        JSONObject v0_2 = v1_1.optJSONObject("search_condition");
                        v1_1 = new JSONObject();
                        v1_1.put("SearchPostsByJson2", v0_2);
                        this.p = v1_1.toString();
                        if(v0_2 != null) {
                            this.m = v0_2.optInt("categoryId");
                            this.n = v0_2.optInt("majorCategoryScriptIndex");
                        }
                        else {
                        }
                    }
                    else {
                    }
                }
                catch(JSONException v0_1) {
                }

                return;
            }

            if(this.h != v5) {
                return;
            }

            if(v1_2 != 999) {
                return;
            }

            if(TextUtils.isEmpty(((CharSequence)v0))) {
                return;
            }

            try {
                this.o = new JSONObject(v0).optString("groupchatSelectTab");
            }
            catch(JSONException v0_1) {
            }
        }
    }

    protected JsonObject() {
        //super();
//        if(Boolean.FALSE.booleanValue()) {
//            System.out.println(DontPreverify.class);
//        }

        this.b = "";
        this.c = "";
        this.d = "";
        this.f = 0;
        this.h = 1;
        this.i = 0;
        this.k = false;
    }

    public static JsonObject a(JSONObject arg5) {
        int v4 = 5;
        JsonObject jsonObject = new JsonObject();
        if(arg5 != null) {
            jsonObject.b = arg5.optString("url");
            jsonObject.a = arg5.optString("id");
            jsonObject.c = arg5.optString("imgurl");
            jsonObject.d = arg5.optString("title");
            jsonObject.e = arg5.optString("adverid");
            jsonObject.f = arg5.optInt("login");
            jsonObject.g = arg5.optInt("loop_time");
            jsonObject.h = arg5.optInt("sign");
            jsonObject.i = arg5.optInt("wapLogin");
            String v1 = arg5.optString("ext_info");
            jsonObject.q = arg5.optString("filter_param");
            jsonObject.r = arg5.optString("topic");
            jsonObject.s = arg5.optInt("show_type", 0);
            jsonObject.t = arg5.optInt("tool_id", 0);
            jsonObject.u = arg5.optString("virture_id");
            jsonObject.x = arg5.optString("trace_extra_from");
            int v2 = 1001;//m.b(jsonObject.b, -1);
            if(jsonObject.h == v4 && v2 > 1000 && !TextUtils.isEmpty(((CharSequence)v1))) {
                try {
                    JSONObject v2_1 = new JSONObject(v1);
                    JSONObject v1_2 = new JSONObject();
                    v1_2.put("SearchPostsByJson2", v2_1);
                    jsonObject.p = v1_2.toString();
                    jsonObject.m = v2_1.optInt("categoryId");
                    jsonObject.n = v2_1.optInt("majorCategoryScriptIndex");
                }
                catch(JSONException v1_1) {
                }

                return jsonObject;
            }

            if(jsonObject.h != v4) {
                return jsonObject;
            }

            if(v2 != 999) {
                return jsonObject;
            }

            if(TextUtils.isEmpty(((CharSequence)v1))) {
                return jsonObject;
            }

            try {
                jsonObject.o = new JSONObject(v1).optString("groupchatSelectTab");
            }
            catch(JSONException v1_1) {
            }
        }

        return jsonObject;
    }
}

