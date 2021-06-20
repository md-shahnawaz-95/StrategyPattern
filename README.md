# StrategyPattern
This is a repository for explaining about the strategy pattern.

#Definition
The Strategy Pattern defines a family of algoriths, encapsulates each one, and make them interchangeble. 
Strategy lets the algorithm vary independently from client that use it.

#Design Principle
Favour composition(has-a) over inheritance(is-a)

#Structure
 _______________              _______________              ____________________
|    Client     |----------> |  IBehavaiour  | =========> | ConcreteBehaviourA |
 _______________              _______________              ____________________  
|  IBehavaiour  |            |     run()     |            |     run()          |
|  execute()    |            |               |            |                    |
|               |            |               |             ____________________
|               |            |               | 
|               |            |               |             ____________________
|_______________|            |_______________| =========> | ConcreteBehaviourB |
                                                           ____________________
                                                          |    run()           |
														  |                    |
														   ____________________
														   


