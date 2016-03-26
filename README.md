# CosmosRoutineXlsToJason
Cosmos College of Management and Technology creates routine for its students in xls format. They print these sheet in the notice board so that the student can view their routine. This was the only method to view the routine. 
This program is ment to change this things. The program extracts only the routine part and creates a json file making routine data easily readable by some other applications. 


##Task List
- [x] Read from xls file
- [x] Read routine of each day, faculty and each period
- [x] Create json file with data
- [ ] Publish the json file on internet

##Assumptions Made About Input File
- The number of periods on one day is 9 
- The starting time of first year is 10:00 and rest other starts at 07:00
- Different years have different number of faculties

##Need to Know About Output File
- Different periods are seprated by "," in subjects, teachers and in rooms

##Sample Output json file
The output file will have format some what like this 
```
{"routine":[{"Day":0,
             "years":[{"year":0,
                       "faculties":[{"teacher":"DM,DM,PG,PG,,SS1\/CPN,SS1\/CPN,HG,HG",
                                     "subjects":"PRGC,PRGC,PHY,PHY,,PHY,PHY,EMTH I,EMTH I",
                                     "type":"L,L,L,L,,P,P,L,L",
                                     "room":"C102,C102,C102,C102,,C202,C202,C102,C102",
                                     "faculty":"BCV-A"},
                                    {"teacher":"DM,DM,PG,PG,,SM,SM,HG,HG",
                                     "subjects":"PRGC,PRGC,PHY,PHY,,ENGD,ENGD,EMTH I,EMTH I",
                                     "type":"L,L,L,L,,P,P,L,L",
                                     "room":"C102,C102,C102,C102,,C302,C302,C102,C102",
                                     "faculty":"BCV-B"},
                                    {"teacher":"PG,PG,DM,DM,,HG,HG,SS1\/CPN,SS1\/CPN",
                                     "subjects":"PHY,PHY,PRGC,PRGC,,EMTH I,EMTH I,PHY,PHY",
                                     "type":"L,L,L,L,,L,L,P,P",
                                     "room":"C103,C103,C103,C103,,C103,C103,C202,C202",
                                     "faculty":"BCV-C"},
                                    {"teacher":"PG,PG,DM,DM,,HG,HG,SM,SM",
                                     "subjects":"PHY,PHY,PRGC,PRGC,,EMTH I,EMTH I,ENGD,ENGD",
                                     "type":"L,L,L,L,,L,L,P,P",
                                     "room":"C103,C103,C103,C103,,C103,C103,C302,C302",
                                     "faculty":"BCV-D"},
                                    {"teacher":"DRP,DRP,SPN,SPN,,MBG,MBG,RRA,RRA",
                                     "subjects":"PRGC,PRGC,EMTH I,EMTH I,,CTECH,CTECH,PST,PST",
                                     "type":"L,L,L,L,,L,L,L,L",
                                     "room":"C101,C101,C101,C101,,C101,C101,C101,C101",
                                     "faculty":"BEIT-A"},
                                    {"teacher":"DRP,DRP,SPN,SPN,,MBG,MBG,RRA,RRA",
                                     "subjects":"PRGC,PRGC,EMTH I,EMTH I,,CTECH,CTECH,PST,PST",
                                     "type":"L,L,L,L,,L,L,L,L",
                                     "room":"C101,C101,C101,C101,,C101,C101,C101,C101",
                                     "faculty":"BEIT-B"},
                                    {"teacher":"PS\/RB,PS\/RB,SS,SS,,RRA,RRA,MBG,MBG",
                                     "subjects":"CHEM,CHEM,BEE,BEE,,PRGC,PRGC,CTECH,CTECH","t

```

##Sample Layout of Input XLS file

![Image of Yaktocat](https://github.com/lastab/CosmosRoutineXlsToJason/blob/master/sample/xls_sample.jpg)