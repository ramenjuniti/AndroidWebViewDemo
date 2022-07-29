package jp.fluct.webviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.demo_webview)

        val html = """
            <html>
                <head>
                    <meta charset="utf-8">
                    <title>WebView Demo</title>
                </head>
                <body>
                    <h1>WebView Demo</h1> 
                    <video controls width="250">
                        <source src="https://i.amoad.com/creatives/9d6/588/91f/edfbc56f51d92f7016494054061479836_original.webm"
                                type="video/webm">
                    </video>
                </body>
            </html>
        """.trimIndent()
        // load inline html
        webView.loadDataWithBaseURL(null,
            html,
            "text/html",
            "UTF-8",
            null)
    }
}