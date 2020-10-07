# PLD_AGILE

# DESCRIPTION :

You must design and implement an application for optimising delivery tours in cities. For more sustainable cities, these deliveries are done with bicycles. When launching the application, the user loads an XML file which describes a city map. This file gives the list of all intersections (such that each intersection has a latitude and a longitude) and the list of all road segments (such that each road segment has an origin intersection, a destination intersection, a name and a length in meters). When a map is loaded, the application displays it. To prepare a tour, the user first loads an XML file which gives the address and time of departure and, a list of requests, such that each request is composed of a pickup address, the duration of the pickup, a delivery address, and the duration of the delivery. Durations are given in seconds, and all addresses correspond to intersections. The application displays the position of each address of the file in the map. Then, the application computes a tour which starts from the departure address, visits all pickup and delivery points (so that, for each request, the pickup address is visited before the delivery address), and returns back to the departure address. The duration of the tour is equal to the travel time plus the duration of every pickup and delivery. To evaluate the duration needed to travel from the origin to the destination of a road segment, you will assume that the travel speed is constant and equal to 15 kilometres per hour. The total duration of the tour must be minimal. The tour must be displayed on the map. The application also displays, for each pickup or delivery point, the arrival and departure time on/from this point. Finally, the user may need to modify the tour (delete some requests, add new requests, or change the order points are visited). After each modification, the application updates arrival and departure times. The user may need to undo/redo these modifications.

# GIT FLOW :

To add a new feature to the code, you must :
1/ Create a new branch with the name US#{jira ticket number} (you do what you want on this branch 
2/ Rebase the development branch on your branch and check that all the tests are OK before merging your changes to the development branch 
3/ After each iteration we will merge the development branch on the main branch in order 
