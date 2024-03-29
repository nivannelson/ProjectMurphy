package furhatos.app.mrsmurphy.flow.main



class DescMake(val fulldesc:String,val smalldesc:String) {
    //All options, used to prime the NLU
}

val keypairs = mapOf(
    "WhatsNew" to "WhatsNew1,WhatsNew2"
)

val nlgdata = mapOf(
    "AboutMurphy" to DescMake(
        "If the Visitor asks, she can give information about the building, what all research and labs are in the building, or even general knowledge about robotics, artificial intelligence",
        ""),
    "WhereamI" to DescMake(
        " in National Robotarium on Heriot watt campus -Edinburgh - (only if Visitor ask)  inaugurated on september 2022 - (only if Visitor ask) collaborated with university of edinburgh -(only if Visitor ask) majorly concentrates on robotics and ai related projects and researches",
        "none1"),
    "NationalRobotarium" to DescMake(
        "rich history - national robotarium a state-of-the-art research facility - Edinburgh - Heriot-Watt campus - inaugrated on september 2022 - collaborated with university of edinburgh - majorly concentrates on robotics and ai related projects and researches",
        "none1"),
    "Researches" to DescMake(
        "wide range of research areas - industry expertise - healthcare - manufacturing - offshore - agriculture - human robot interaction - conversation agents",
        ""),
    "HealthCare" to DescMake(
        "part of a multimillion-pound collaborative project involving experts from eight european and asian institutions... spring (socially pertinent robots in gerontological healthcare) is the first research project to be announced by the national robotarium. spring... a four-year project funded by horizon2020... will develop socially assistive robots (sars) with the capacity to perform multi-person interactions and open domain social conversation for the first time in a healthcare setting. the work builds on the success of heriot-watt university-s amazon alexa prize conversational ai system `alana-. the project will focus on supporting elderly patients by carefully coupling scientific findings and user-focussed technological developments to bring social robots into gerontological healthcare. over the past five years... social robots have been introduced into many public spaces ranging from museums and malls to hospitals and retirement homes. the robots have been able to provide both information and entertainment... but the technology has faced challenges. limitations include the fact that both the hardware and supporting software is often designed for reactive... single-user interactions... leading to limited one-on-one conversations. as a result... the robots typically wait for commands or questions based on a limited set of scripted actions. professor oliver lemon... heriot-watt university... explains why spring is different. he said: research shows that the careful use of robots in group settings can have a positive impact on health... such as decreased stress and loneliness... and improved mood and sociability. healthcare practitioners have been supportive of the use of robots during the non-medical phases of time in hospital because social robots can help explain complex concepts to patients with limited medical knowledge. social robot technology is of interest for elder care because robot companionship has the long-term potential to better connect people with each other. social robots could improve both psychological well-being and the relationship between patients and hospital professionals. while overcoming the limitations of current social robots raises numerous scientific and technological challenges... it has the potential to create tremendous social impact and economic value. the national robotarium-s focus on creating societal benefits is ideally aligned to addressing such challenges. this type of technology is touch-free and hands-free so will be in great demand in the future as it will reduce the risk and spread of infection. spring will develop new research into conversational ai... computer vision... machine learning and human-robot interaction... alongside human behaviour analysis and sensorimotor robot control. the work will focus on helping social robots to understand various individuals and group situations and take appropriate decisions such as identifying patients that have been waiting alone for a long time or who might be anxious. the social robots willultimately engage in face-to-face conversation with patients... their family members... staff members... and with whole groups of people.",
        ""),
    "Manufacturing" to DescMake(
        " -1.3m project investigates if robots can be used to build lasers. experts at the new national robotarium in edinburgh and their industrial partners have launched a -1.3 million project to work out if robots could be used to help humans build lasers. manufacturing lasers is a lengthy and delicate process... with individual components aligned step-by-step as each device is assembled. currently... the process requires dedicated manufacturing lines... which makes it difficult and expensive for the companies that produce lasers to respond quickly to changes in demand from their markets. the new three-year project... funded by the ukri engineering and physical sciences research council (epsrc)... aims to discover if robots could be used to carry out some of the most repetitive and time-consuming assembly and alignment steps in the manufacturing process... which would then free up humans to concentrate on the important testing and quality-control steps. announcement of the groundbreaking research project comes as the national robotarium officially opened the doors to its new state-of-art -22.4 million facility in edinburgh on 28th september... 2022. utilising expertise from both heriot-watt university and the university of edinburgh... it is the most advanced centre for robotics and ai in the uk and houses extensive world-class facilities for researchers and businesses. lasers will play an important role in the newly opened facility - the site has a dedicated laser laboratory... and its projects include developing robots that will use the devices across a wide range of applications... from remote sensing for agriculture through to diagnosis and treatment in medicine. researchers from the national robotarium will be joined in their laser project by industrial experts from optical components manufacturer gooch & housego... aerospace giant leonardo and laser maker luxinar. the national robotarium is part of the data-driven innovation initiative... supported by -21 million from the uk government and -1.4 million from the scottish government. the initiative aims to turn edinburgh into the data capital of europe and is part of the wider -1.3 billion edinburgh and south-east scotland city region deal. project leader and ultra lab lead at the national robotarium... dr richard carter... said: this project will push our understanding of robots- capabilities to the limit. no one knows if robots will be capable of carrying out such complex and intuitive tasks... and so we-ll be working with experienced personnel from throughout the industry to find out. making lasers is a delicate and highly skilled job... with many repetitive steps to make sure each component is aligned as it-s assembled into the device. if we can design robots that can carry out many of those repetitive steps then we will be able to improve the quality of the jobs for the talented experts who make these lasers and free them up to work on the important testing and quality assurance steps in the process. dr carter added: one of the activities we-ll undertake during this project is to film experts assembling lasers and then ask them questions about what they do at each step. so much of the manufacturing process is down to human intuition and experience... and it-s really difficult to teach those factors to a machine. if we can develop robots and control systems that can carry out these tasks then the results will have applications in other fields too.",
        ""),
    "Offshore" to DescMake(
        "rov windfarm inspection gets global coverage. researchers from the national robotarium... a world-leading centre for robotics and artificial intelligence who are working with businesses to develop valuable solutions to industry challenges... helped edf deploy a uniquely customised remotely operated vehicle (rov) to carry out what is believed to be the first autonomous wind farm foundation inspection at its blyth offshore wind farm. the rov... equipped and operated by researchers from the orca hub... a strategic project within the national robotarium... was modified to include cutting-edge robotic technologies for autonomous inspection capabilities and carried out visual inspections of the gravity-based foundations of three offshore turbines over the course of four days. the inspections were undertaken as part of a partnership between edf and the orca hub to investigate a wide range of potential applications for drone technology to assess offshore wind turbines. the trials demonstrated the drones ability to work autonomously at the site... as it recorded videos to assess the exterior condition of turbine foundations and cables. the drone was also used to create a 3d reconstruction model of parts of the underwater assets... which will be used to monitor biofouling... the accumulation of microorganisms... plants and algae on the turbine foundations. maxime duchet... offshore wind research engineer at edf r&d uk centre... said: these trials have showcased the ability of autonomous inspection drones to collect high-quality images off offshore turbine technology. these images... and the modelling they enable... will greatly enhance our ability to carry out operations and maintenance activities on-site. further tests are needed to estimate the time required to inspect all of the turbine foundations... and to demonstrate the full potential of marine robotic technology. however it is clear from these initial results that the technology can ensure safer and faster operations and a reduced carbon footprint. dr sen wang... former lead of robotics and autonomous systems at the national robotarium... said: this trial demonstrates the enormous potential for underwater robots to autonomously carry out inspection and maintenance of offshore wind turbines... reducing the need and the associated risks of putting personnel into challenging and hazardous environments. by equipping the rov with sensors and robot autonomy software developed by the orca hub... we can obtain high-quality videos and build an extremely accurate 3d model of the turbine foundations... providing rich information in a more efficient manner for companies working in this sector. due to their locations... offshore wind farms are costly and difficult to monitor and maintain with the industry currently facing a range of challenges such as cost... safety and operational logistics. the orca hub can help its partners to overcome many of these challenges. we are already demonstrating the many benefits of using robotics in the offshore renewable sector... giving service providers and operators... like edf... a wealth of information and data to support their planning... maintenance and decision-making while reducing costs... risks and carbon footprint. The team is lead by Professor Yvan Petillot.",
        ""),
    "Agriculture" to DescMake(
        "Tackling food security ... Dr Fernando Auat Cheein, Associate Professor in Robotics and Autonomous Systems ... Early “robots” in agriculture were actually automated harvesting machines. We’ve added intelligence and decision-making capability and now robots harvest, plant, seed, prune, do herbicide management, monitor and observe the characteristics of crops – all the main tasks ... Connecting those robots into the cloud means the robot gets information from sensors and allows farmers to make future decisions based on real-life data. For example, you can distinguish between what should be harvested and what should be left in the field – and estimate the amount of harvest before picking to plan better and reduce costs.Robots are not replacing people in agriculture – there aren’t enough humans to do the work and that is becoming a greater problem. Globally, younger generations don’t want to work in the fields. It’s better to start doing things with robots now than wait until we don’t have a human labour force. Robots can also do tasks humans shouldn’t do, like carrying 20kg of fruit on your back.You also have environmental benefits as robots are largely electrically controlled, rather than using combustion engines.One challenge is that agriculture can be resistant to change and wants clear evidence that technology works. If it doesn’t work, you have to wait until the next year, and try something different.Another challenge is that different fruits and vegetables need different solutions in different countries. If we design a robot that works in Scotland it might not work well in Brazil or Australia, where the weather, soil and humidity are different. We need technology to help countries where there isn’t enough water, for example, to spread herbicides efficiently so they are not damaging soils, and to monitor all the different indicators.Ultimately, it’s about using robotics, AI and data to make agriculture more efficient and deliver larger, better quality and more predictable crops. The world’s population is growing and we need more food. In Europe, we’re taking this into vertical farming, where the inputs are controlled in an industrial process. That’s developing all the time, but there is still so much robotics can do for traditional field agriculture.",
        ""),
    "CDT" to DescMake(
        "the Centre for Doctoral Training in Robotics and Autonomous Systems is a unique training programme for PhD students who are interested in developing their skills and expertise in the rapidly advancing field of robotics. The CDT is a partnership between Heriot-Watt University and the University of Edinburgh... and it offers students access to cutting-edge research facilities and world-class supervision.The CDT in Robotics and Autonomous Systems was initiated in 2013 and is a highly selective programme that attracts top students from ... around the world. The programme emphasizes interdisciplinary research... industry engagement... and a comprehensive training programme. It is a world-leading programme at the forefront of research in robotics and autonomous systems.The CDT in Robotics and Autonomous Systems acquired 18 million pounds in funding in 2019. That's a significant amount of funding... and it's a testament to the important work that's being done in this field.",
        "Orca"),
    "Orca" to DescMake(
        "The ORCA Hub is a research project at the National Robotarium that received 18 million pounds in funding. The project is a collaboration between several universities and industry partners... with a focus on developing intelligent offshore robotics for use in the energy industry. The ORCA Hub aims to create new robotic systems that can operate safely and efficiently in harsh offshore environments... and can work alongside human operators to improve safety... efficiency... and productivity. The project is focused on developing advanced sensing and perception technologies... as well as new algorithms and control systems to enable robots to perform complex tasks autonomously. Overall... the ORCA Hub is an exciting project that is pushing the boundaries of what's possible in the field of offshore robotics.",
        ""),
    "UpcomingEvent" to DescMake(
        "Join us on Saturday 15 April for 'Robots After Dark', a special evening event during the Edinburgh Science Festival! This adults-only event will include hands-on robotic demonstrations and interactive activities that showcase our research building trust between humans robots and autonomous systems. With live activities, discussions, drinks, food and talks, Robots After Dark is set to be a fun and thought-provoking night to remember! Tickets are £12 / £10 and can be purchased through the Edinburgh Science Festival website.",
        ""),
    "WhatsNew1" to DescMake(
        "A group of young robotics enthusiasts visited the National Robotarium on 9 March for an inspiring day of activities. Sabaht Bashir, Lead for Outreach and Engagement, gave the group of 15 pupils from McLaren High School's Robotics and STEMTroopers clubs a tour of the state-of-the-art facility and VR (Virtual Reality) and AR (Augmented Reality) 'imagineering' suite before introducing them to the Spot robot dog. In the afternoon, the group were led through a series of tasks and talks to help inspire them to consider a career in robotics, AI and other fields of science and technology.",
        ""
    ),
    "WhatsNew2" to DescMake(
        "The National Robotarium was host venue for a Heriot-Watt University International Women's Day event. Organised by the School of Engineering and Physical Sciences (EPS) Athena SWAN team, the event brought together staff and students to share insights and recognise the incredible contributions of women. Speakers included Dr Ellie Ebrahimi, Space Technology Manager at international product design and manufacturing company Plexus Corp, Prof. Vicki Stone, Director of IB3, and Prof. Gill Thomson (pictured), EPS Deputy Director of Learning and Teaching",
        ""
    ),
    "ConversationalAgents" to DescMake(
        "A team of student researchers from the National Robotarium have reached the next round of the Amazon Alexa Prize SimBot Challenge, a global AI competition that tasks university teams with developing a bot that can best respond to people’s commands and demands. Team EMMA (Embodied MultiModal Agent), led by PhD students Amit, Hementhage, Malvina, and Georgios, successfully completed the Public Benchmark Challenge in April. The challenge involved talking a robot model through a series of household tasks using predefined dialogue datasets – created and provided by Amazon – to assess its ability to follow instructions, learn, and predict changes in its 3D virtual environment. Team EMMA, the only non-US team to be shortlisted for the competition, placed sixth on the leader board, allowing them to continue into the ‘live interactions’ development phase, beginning in July 2022. During this phase, the teams will compete to develop a bot that best responds to real Alexa customers who will rate, review and feedback in real-time. The outcome of the development phase will be revealed during the finals, scheduled for early 2023. Professor Verena Rieser, Professor of Conversational AI at the National Robotarium, and team advisor said: 'The Alexa Prize SimBot Challenge is focused on helping advance the next generation of virtual assistants that will assist humans in completing real-world tasks.'The technology and research being developed by the teams involved is really exciting as it could ultimately mean that robots are able to help and support people in their homes and other real-life environments.",
        ""
    ),
    "Helen Hastie" to DescMake(
        "Professor Helen Hastie is leading the UKRI TAS Node in Trust which aims to establish a research center for designing trustworthy autonomous systems that are widely accepted and used in various applications. She is the Director Centre for Doctoral Training in Robotics and Autonomous Systems (CDT-RAS) and Academic Co-Lead for the National Robotarium",
        "none1"),
    "Yvan Petillot" to DescMake(
        "Prof. Yvan Petillot is a distinguished academic at Heriot-Watt University, with expertise in Robotics and Computer Vision. He holds multiple leadership roles, including deputy director of the Institute for Sensor Signals and Systems and the joint research institute in Signal and Image Processing with Edinburgh University.",
        "none2"),
    "Oliver Lemon" to DescMake(
        "",
        "none2"),
    "Lynne Baillie" to DescMake(
        "She is the head of Human-Robot Interaction at the National Robotarium and she leads on research into assistive living technologies",
        "none2"),
    "Duncan Hand" to DescMake(
        "Duncan Hand is Professor of Applied Photonics...His current key focus is on manufacturing of medical devices, and he is Director of the Medical Device Manufacturing Centre and  Multi-modal Medical Device Manufacturing",
        "none2"),
    "Sethu Vijayakumar" to DescMake(
        "",
        "none2"),
    "Nick Taylor" to DescMake(
        "",
        "none2"),
    "Mauro Dragone" to DescMake(
        "",
        "none2"),
    "Christian Dondrup" to DescMake(
        "",
        "none2"),
    "Mustafa Suphi" to DescMake(
        "",
        "none2"),
    "Patricia  A Vargas" to DescMake(
        "",
        "none2"),
    "Wei Pang" to DescMake(
        "",
        "none2"),
    "Carlos Mastalli" to DescMake(
        "",
        "none2"),
    "Michael Lones" to DescMake(
        "",
        "none2"),
    "Mustafa Suphi Erden" to DescMake(
        "",
        "none2"),
    "Fernando Auat Cheein" to DescMake(
        "",
        "none2"),
    "Alistair McConnell" to DescMake(
        "",
        "none2"),
    "Nick Taylor" to DescMake(
        "",
        "none2"),
    "Subramanian Ramamoorthy" to DescMake(
        "",
        "none2"),
    "Stewart Miller" to DescMake(
        " Stewart Miller is  the ceo  of national robotarium",
        "none2"),
    "Industry Partners" to DescMake(
        "",
        "none2"),
    "EDF" to DescMake(
        "",
        "none2"),
    "NHS Grampian" to DescMake(
        "",
        "none2"),
    "Leuchie House Charity" to DescMake(
        "",
        "none2"),
    "Fourier Intelligence" to DescMake(
        "",
        "none2"),
    "Richard A Williams" to DescMake(
        "",
        "none2"),
    "RobotsinRobotarium" to DescMake(
        "Pepper,Nao, Ari, Spot,iCub, Cozmo, Tiago, MiRo...",
        "none2")
)
