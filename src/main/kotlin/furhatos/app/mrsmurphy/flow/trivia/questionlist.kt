package furhatos.app.mrsmurphy.flow.trivia


// list of question murphy can ask while idle format question,descriptions or facts, answer, wrong answers(options)
val questionsEnglish = mutableListOf(
    Question("Have you heard about the Centre for Doctoral Training in Robotics and Autonomous Systems? If so can you say which year this programme was initiated?...",
        "the Centre for Doctoral Training in Robotics and Autonomous Systems is a unique training programme for PhD students who are interested in developing their skills and expertise in the rapidly advancing field of robotics. The CDT is a partnership between Heriot-Watt University and the University of Edinburgh... and it offers students access to cutting-edge research facilities and world-class supervision.The CDT in Robotics and Autonomous Systems was initiated in 2013 and is a highly selective programme that attracts top students from ... around the world. The programme emphasizes interdisciplinary research... industry engagement... and a comprehensive training programme. It is a world-leading programme at the forefront of research in robotics and autonomous systems.",
        answer = listOf("2013","13"),
        alternatives = listOf(listOf("2010","10"), listOf("2019","19"), listOf("2015","15"))),
    Question("Do you know know how much funding the annual Centre for Doctoral Training in Robotics and Autonomous Systems program has acquired in 2019?",
        "The CDT in Robotics and Autonomous Systems acquired 18 million pounds in funding in 2019. That's a significant amount of funding... and it's a testament to the important work that's being done in this field.",
        answer = listOf("18 millions pounds"),
        alternatives = listOf(listOf("100 thousand pounds","hundred","100"), listOf("1 million pounds","1"))),
    Question("How many universities are involved in the partnership that created the National Robotarium?",
        "Heriot-Watt University and the University of Edinburgh",
        answer = listOf("2", "two"),
        alternatives = listOf(listOf("1", "one"), listOf("3", "three"))),
    Question("How much funding did National Robotarium received from the UK government?",
        "The project was awarded 21 million pounds in funding from the UK government’s Industrial Strategy Challenge Fund with an additional £1.4 million from the Scottish Funding Council. ",
        answer = listOf("21 million pounds", "21 million"),
        alternatives = listOf(listOf("1 million pounds", "one million"), listOf("10 million pounds", "ten million")))
)
