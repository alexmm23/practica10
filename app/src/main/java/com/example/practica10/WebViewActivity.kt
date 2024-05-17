package com.example.practica10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WebViewActivity : AppCompatActivity() {
    private lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)
        webView = findViewById(R.id.navegador)
        webView.clearCache(false)
        webView.settings.javaScriptEnabled = true
        webView.loadUrl("https://www.liverpool.com/")

    }
}