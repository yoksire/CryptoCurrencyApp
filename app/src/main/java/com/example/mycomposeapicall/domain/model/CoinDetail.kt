package com.example.mycomposeapicall.domain.model

import com.example.mycomposeapicall.data.remote.dto.CoinDetailDto
import com.example.mycomposeapicall.data.remote.dto.Links
import com.example.mycomposeapicall.data.remote.dto.TeamMember

data class CoinDetail(
    val coinId:String,
    val name:String,
    val description:String,
    val symbol:String,
    val rank:Int,
    val isActive:Boolean,
    val tags:List<String>,
    val team:List<TeamMember>,
    val type:String,
    val link: Links
)
