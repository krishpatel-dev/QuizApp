package com.krishhh.quizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.flag_india,
            "Ireland",
            "India",
            "Niger",
            "Italy",
            2
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.flag_australia,
            "New Zealand",
            "United Kingdom",
            "Australia",
            "United States",
            3
        )
        questionsList.add(que2)

        val que3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.flag_china,
            "Japan",
            "South Korea",
            "Vietnam",
            "China",
            4
        )
        questionsList.add(que3)

        val que4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.flag_england,
            "England",
            "United Kingdom",
            "Australia",
            "United States",
            1
        )
        questionsList.add(que4)

        val que5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.flag_france,
            "France",
            "Belgium",
            "Luxembourg",
            "Germany",
            1
        )
        questionsList.add(que5)

        val que6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.flag_germany,
            "Austria",
            "Switzerland",
            "Germany",
            "Netherlands",
            3
        )
        questionsList.add(que6)

        val que7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.flag_japan,
            "South Korea",
            "Japan",
            "Taiwan",
            "China",
            2
        )
        questionsList.add(que7)

        val que8 = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.flag_newzealand,
            "Australia",
            "United Kingdom",
            "Canada",
            "New Zealand",
            4
        )
        questionsList.add(que8)

        val que9 = Question(
            9,
            "What country does this flag belong to?",
            R.drawable.flag_unitedkingdom,
            "United States",
            "Canada",
            "United Kingdom",
            "Australia",
            3
        )
        questionsList.add(que9)

        val que10 = Question(
            10,
            "What country does this flag belong to?",
            R.drawable.flag_unitedstates,
            "United Kingdom",
            "Canada",
            "Mexico",
            "United States",
            4
        )
        questionsList.add(que10)

        return questionsList
    }
}