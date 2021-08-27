package com.example.lasbetalk.model

import java.util.*
import kotlin.collections.HashMap

class ChatModel (val users: HashMap<String, Boolean> = HashMap(),
                 val comments : HashMap<String, Comment> = HashMap()){
    class Comment (val uid : String? = null, val message : String? = null)
}
