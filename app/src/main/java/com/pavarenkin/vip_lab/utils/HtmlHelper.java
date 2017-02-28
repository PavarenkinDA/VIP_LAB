package com.pavarenkin.vip_lab.utils;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;

/**
 * Created by Дмитрий Паваренкин on 25.02.2017.
 */

public class HtmlHelper {

    public Spanned HtmlToString(String html) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY);
        } else {
            return Html.fromHtml(html);
        }
    }

}
