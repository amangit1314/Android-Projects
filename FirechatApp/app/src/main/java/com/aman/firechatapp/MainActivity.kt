package com.aman.firechatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity constructor() : AppCompatActivity(), RoomListener {
    private var channelID: String? = "CHANNEL_ID_FROM_YOUR_SCALEDRONE_DASHBOARD"
    private var roomName: String? = "observable-room"
    private var editText: EditText? = null
    private var scaledrone: Scaledrone? = null
    @Override
    protected fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // This is where we write the mesage
        editText = findViewById(R.id.editText) as EditText?
    }

    // Successfully connected to Scaledrone room
    @Override
    fun onOpen(room: Room?) {
        System.out.println("Conneted to room")
    }

    // Connecting to Scaledrone room failed
    @Override
    fun onOpenFailure(room: Room?, ex: Exception?) {
        System.err.println(ex)
    }

    // Received a message from Scaledrone room
    @Override
    fun onMessage(room: Room?, receivedMessage: com.scaledrone.lib.Message?) {
        // TODO
    }

    private open fun getRandomName(): String? {
        val adjs: kotlin.Array<String?>? = arrayOf<String?>(
            "autumn",
            "hidden",
            "bitter",
            "misty",
            "silent",
            "empty",
            "dry",
            "dark",
            "summer",
            "icy",
            "delicate",
            "quiet",
            "white",
            "cool",
            "spring",
            "winter",
            "patient",
            "twilight",
            "dawn",
            "crimson",
            "wispy",
            "weathered",
            "blue",
            "billowing",
            "broken",
            "cold",
            "damp",
            "falling",
            "frosty",
            "green",
            "long",
            "late",
            "lingering",
            "bold",
            "little",
            "morning",
            "muddy",
            "old",
            "red",
            "rough",
            "still",
            "small",
            "sparkling",
            "throbbing",
            "shy",
            "wandering",
            "withered",
            "wild",
            "black",
            "young",
            "holy",
            "solitary",
            "fragrant",
            "aged",
            "snowy",
            "proud",
            "floral",
            "restless",
            "divine",
            "polished",
            "ancient",
            "purple",
            "lively",
            "nameless"
        )
        val nouns: kotlin.Array<String?>? = arrayOf<String?>(
            "waterfall",
            "river",
            "breeze",
            "moon",
            "rain",
            "wind",
            "sea",
            "morning",
            "snow",
            "lake",
            "sunset",
            "pine",
            "shadow",
            "leaf",
            "dawn",
            "glitter",
            "forest",
            "hill",
            "cloud",
            "meadow",
            "sun",
            "glade",
            "bird",
            "brook",
            "butterfly",
            "bush",
            "dew",
            "dust",
            "field",
            "fire",
            "flower",
            "firefly",
            "feather",
            "grass",
            "haze",
            "mountain",
            "night",
            "pond",
            "darkness",
            "snowflake",
            "silence",
            "sound",
            "sky",
            "shape",
            "surf",
            "thunder",
            "violet",
            "water",
            "wildflower",
            "wave",
            "water",
            "resonance",
            "sun",
            "wood",
            "dream",
            "cherry",
            "tree",
            "fog",
            "frost",
            "voice",
            "paper",
            "frog",
            "smoke",
            "star"
        )
        return ((adjs.get(Math.floor(Math.random() * adjs.size) as kotlin.Int).toString() +
                "_" +
                nouns.get(Math.floor(Math.random() * nouns.size) as kotlin.Int)))
    }

    private open fun getRandomColor(): String? {
        val r: Random? = Random()
        val sb: StringBuffer? = StringBuffer("#")
        while (sb.length() < 7) {
            sb.append(Integer.toHexString(r.nextInt()))
        }
        return sb.toString().substring(0, 7)
    }
}