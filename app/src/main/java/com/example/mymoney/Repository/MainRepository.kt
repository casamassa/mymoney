package com.example.mymoney.Repository

import com.example.mymoney.Domain.ExpenseDomain

class MainRepository {
    val items = mutableListOf(
        ExpenseDomain("Restaurant", 573.12, "img1", "17 jun 2025 19:15"),
        ExpenseDomain("McDonald", 77.82, "img2", "16 jun 2025 13:57"),
        ExpenseDomain("Cinema", 23.47, "img3", "16 jun 2025 20:45"),
        ExpenseDomain("Restaurant", 573.12, "img1", "15 jum 2025 22:18")
    )
}