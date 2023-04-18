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
//    Question("How many universities are involved in the partnership that created the National Robotarium?",
//        "Heriot-Watt University and the University of Edinburgh",
//        answer = listOf("2", "two"),
//        alternatives = listOf(listOf("1", "one"), listOf("3", "three"))),
    Question("How much funding did National Robotarium received from the UK government?",
        "The project was awarded 21 million pounds in funding from the UK government’s Industrial Strategy Challenge Fund with an additional £1.4 million from the Scottish Funding Council. ",
        answer = listOf("21 million pounds", "21 million"),
        alternatives = listOf(listOf("1 million pounds", "one million"), listOf("10 million pounds", "ten million"))),
    Question("Who founded Unimation, the first commercial company to make robots?",
        "In 1956, inventor George C. Devol and engineer Joseph F. Engelberger met over drinks to discuss the writings of Isaac Asimov. After the encounter, Engelberger believed that robots were ready to move from the pages of science fiction and into American factories. He founded Unimation to bring the concept to life, while Devol wrote the first patents",
        answer = listOf("Joseph F. Engelberger", "Joseph","Engelberger"),
        alternatives = listOf(listOf("Lee Iacocca", "Lee","mister Iacocca"), listOf("Walt Disney", "Walt"))),
    Question("Which car company was an early adopter of Unimate, the first robot from Unimation?",
        "Unimation designed its initial robot specifically for the auto industry. Known as Unimate, the robot's first home was a General Motors plant, where it worked with heated die-casting machines",
        answer = listOf("General Motors"),
        alternatives = listOf(listOf("Chrysler"), listOf("Ford"))),

    Question("Which company created the first mobile robot system nicknamed Shakey in the late 1960s?",
        "It began as an offshoot of Stanford University in 1946, but SRI became an independent enterprise in 1970, when it changed its name to SRI International. From 1966 to 1972, SRI's artificial intelligence team worked on Shakey,a moving robot that could maneuver around obstacles.",
        answer = listOf("SRI International"),
        alternatives = listOf(listOf("Honda Motor Company"), listOf("iRobot"))),

    Question("Which four-wheeled robot successfully crossed a room without human intervention in 1979?",
        "Graduate student James Adams constructed the first version of the Stanford Cart in 1960 to explore the possibility of controlling a lunar rover from Earth. In 1977, Hans Moravec rebuilt the cart and added a television camera. Equipped with its new stereo vision, the Stanford Cart was able to cross a chair-filled room without bumping into obstacles in 1979.",
        answer = listOf("Stanford Cart","Stanford"),
        alternatives = listOf(listOf("Carl the Cart"), listOf("Gort the Cart"))),

//    Question("In 1969, Victor Scheinman made a breakthrough when he designed a robot that could function like which anatomical feature?",
//        "",
//        answer = listOf("Arm"),
//        alternatives = listOf(listOf("Face"), listOf("Leg"))),

    Question("Which nation uses the greatest number of robots in manufacturing?",
        "The Japanese people have had a long-time love affair with robots. In fact, Japan employs more than 250,000 industrial robot workers -- more than any other nation. According to some experts, the robots help fill the gap created by Japan's declining birthrate and shrinking workforce.",
        answer = listOf("Japan"),
        alternatives = listOf(listOf("Brazil"), listOf("Germany"))),

    Question("German engineers took this robot from the factory floor and reprogrammed it to draw portraits?",
        "To prove that a robot can move you emotionally, scientists at Fraunhofer-Gesellschaft, the largest organization for applied research in Europe, converted an industrial robot into a portrait artist",
        answer = listOf("Fraunhofer Sketchbot", "Fraunhofer", "Sketchbot"),
        alternatives = listOf(listOf("RWI AutoDraw"),listOf("SRI Van GoghBot"))),

    Question("Which robot made the famous No Hands Across America tour in 1995?",
        "Researchers at Carnegie Mellon did something the world thought impossible: They made a Pontiac TransSport minivan seem cool. They packed computers and video sensors into the vehicle so it could steer itself at legal speeds on roads and highways",
        answer = listOf("NavLab"),
        alternatives = listOf(listOf("Roomba"), listOf("ASIMO"))),

    Question("iRobot, the company behind the Roomba vacuum cleaner, was founded by scientists from this prestigious university?",
        "MIT roboticists Colin Angle, Helen Greiner and Rodney Brooks co-founded iRobot in 1990. The company's early robots were designed for defense and public safety. Then, in 2002, it launched the Roomba floor vacuuming robot and became a household name",
        answer = listOf("Massachusetts Institute of Technology", "MIT", "Massachusetts"),
        alternatives = listOf(listOf("Yale University"), listOf("Carnegie Mellon University","Carnegie Mellon")))
)

