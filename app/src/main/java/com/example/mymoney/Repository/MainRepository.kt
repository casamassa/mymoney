package com.example.mymoney.Repository

import com.example.mymoney.Domain.BudgetDomain
import com.example.mymoney.Domain.ExpenseDomain

class MainRepository {
    val items = mutableListOf(
        ExpenseDomain("Resturant", 573.12, "resturant", "17 jun 2025 19:15"),
        ExpenseDomain("McDonald", 77.82, "mcdonald", "16 jun 2025 13:57"),
        ExpenseDomain("Cinema", 23.47, "cinema", "16 jun 2025 20:45"),
        ExpenseDomain("Resturant", 573.12, "resturant", "15 jum 2025 22:18")
    )

    val budget = mutableListOf(
        BudgetDomain("Home Load",1200.0,80.8),
        BudgetDomain("Sunscription",550.0,10.0),
        BudgetDomain("Car Loan",800.0,30.0)
    )
}