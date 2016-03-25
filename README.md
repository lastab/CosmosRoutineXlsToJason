# CosmosRoutineXlsToJason
Cosmos College of Management and Technology creates routine for its students in xls format. They print these sheet in the notice board so that the student can view their routine. This was the only method to view the routine. 
This program is ment to change this things. The program extracts only the routine part and creates a json file making routine data easily readable by some other applications. 


##Task List
- [x] Read from xls file
- [x] Read routine of each day, faculty and each period
- [ ] Create json file with data
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
{"routine":[
{ "day":"Sunday",
  "batches":[
      {"year":"0",
       "faculties":[{"faculty":"BCE-A",
                     "subjects":"MTH1,MTH1,PHY,PHY,NO PERIOD,CEM,CEM,ENG,ENG",
                     "teachers":"SPN,SPN,JK,JK,,RP,RP,AK,AK",
                     "rooms":"A101,A101,A102,A102,,C101,C101,C202,C202"},                    
                    {"faculty":"BCE-B",
                     "subjects":"PHY,PHY,MTNH1,MTH1,NO PERIOD,CEM,CEM,ENG,ENG",
                     "teachers":"JK,JK,SPN,SPN,,RP,RP,AK,AK",
                     "rooms":"A102,A102,A101,A101,,C101,C101,C202,C202"}                    
                   ]},
      {"year":"1",
       "faculties":[{"faculty":"BCE-A",
                     "subjects":"MTH1,MTH1,PHY,PHY,NO PERIOD,CEM,CEM,ENG,ENG",
                     "teachers":"SPN,SPN,JK,JK,,RP,RP,AK,AK",
                     "rooms":"A101,A101,A102,A102,,C101,C101,C202,C202"},                    
                    {"faculty":"BCE-B",
                     "subjects":"PHY,PHY,MTNH1,MTH1,NO PERIOD,CEM,CEM,ENG,ENG",
                     "teachers":"JK,JK,SPN,SPN,,RP,RP,AK,AK",
                     "rooms":"A102,A102,A101,A101,,C101,C101,C202,C202"}
                   ]}
  ]
},
{ "day":"Monday",
  "batches":[
      {"year":"0",
       "faculties":[{"faculty":"BCE-A",
                     "subjects":"MTH1,MTH1,PHY,PHY,NO PERIOD,CEM,CEM,ENG,ENG",
                     "teachers":"SPN,SPN,JK,JK,,RP,RP,AK,AK",
                     "rooms":"A101,A101,A102,A102,,C101,C101,C202,C202"},                    
                    {"faculty":"BCE-B",
                     "subjects":"PHY,PHY,MTNH1,MTH1,NO PERIOD,CEM,CEM,ENG,ENG",
                     "teachers":"JK,JK,SPN,SPN,,RP,RP,AK,AK",
                     "rooms":"A102,A102,A101,A101,,C101,C101,C202,C202"}                    
                   ]},
      {"year":"1",
       "faculties":[{"faculty":"BCE-A",
                     "subjects":"MTH1,MTH1,PHY,PHY,NO PERIOD,CEM,CEM,ENG,ENG",
                     "teachers":"SPN,SPN,JK,JK,,RP,RP,AK,AK",
                     "rooms":"A101,A101,A102,A102,,C101,C101,C202,C202"},                    
                    {"faculty":"BCE-B",
                     "subjects":"PHY,PHY,MTNH1,MTH1,NO PERIOD,CEM,CEM,ENG,ENG",
                     "teachers":"JK,JK,SPN,SPN,,RP,RP,AK,AK",
                     "rooms":"A102,A102,A101,A101,,C101,C101,C202,C202"}
                   ]}
  ]
}

]}
```

![Image of Yaktocat](https://github.com/lastab/CosmosRoutineXlsToJason/blob/master/sample/xls_sample.jpg)