package android.com.goodsell.action;


import android.text.TextUtils;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Vector;

public class CovertJson {
    public Vector a;
    public Vector b;

    public CovertJson() {
        super();
//        if(Boolean.FALSE.booleanValue()) {
//            System.out.println(DontPreverify.class);
//        }
    }

    public static CovertJson a(String arg8) {
        CovertJson v0_1;
        CovertJson v1 = null;
        if(!TextUtils.isEmpty(((CharSequence)arg8))) {
            try {
                v0_1 = new CovertJson();
            }
            catch(Exception v0) {
                return v1;
            }

            try {
                JSONObject v1_2 = new JSONObject(arg8);
                if(v1_2 == null) {
                    return v0_1;
                }

                JSONObject v3 = v1_2.optJSONObject("data");
                if(v3 == null) {
                    return v0_1;
                }

                JSONArray v4 = v3.optJSONArray("top");
                if(v4 != null) {
                    int v5 = v4.length();
                    v0_1.a = new Vector(v5);
                    int v1_3;
                    for(v1_3 = 0; v1_3 < v5; ++v1_3) {
                        v0_1.a.add(new JsonObject(v4.optJSONObject(v1_3)));
                    }
                }

                JSONArray v3_1 = v3.optJSONArray("bottom");
                if(v3_1 == null) {
                    return v0_1;
                }

                int v4_1 = v3_1.length();
                v0_1.b = new Vector(v4_1);
                for(int v1_3 = 0; true; ++v1_3) {
                    if(v1_3 >= v4_1) {
                        return v0_1;
                    }

                    v0_1.b.add(new JsonObject(v3_1.optJSONObject(v1_3)));
                }
            }
            catch(Exception v1_1) {
                return v0_1;
            }
        }

        return v1;
    }
}

