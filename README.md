# CosmosRoutineXlsToJason
Cosmos College of Management and Technology creates routine for its students in xls format. They print these sheet in the notice board so that the student can view their routine. This was the only method to view the routine. 
This program is ment to change this things. The program extracts only the routine part and creates a json file making routine data easily readable by some other applications. 

##Sample Output json file
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
