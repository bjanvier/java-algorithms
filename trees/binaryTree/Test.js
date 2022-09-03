/**
    [
        Resolve the puzzle using Haffman algorithm technique
        Questions:
        [0,1] : [
                "Soccer", 
                "Basketball"
            ]
        [0,1]: [
            ["UCL", "World Cup"], 
            ["NBA", "European Basketball"]
        ]
        [0,1]:[
            [["Real Madrid", "AC. MILAN"], ["Brazil", "Argentina"]],
            [["Lakers", "Boston"], ["DR. Congo", "USA Team"]]
        ]
        [0,1]:["8 new leaves of interior nodes in here"]
        etc...

        User answers: 
        [0,1,1,0....] = 
    ]
 * Choosing favorite sport using binary tree
 * 
    root node
 * Question 1. SOCCER OR BASKETBALL
 * 
    if (soccer is picked){
        //root should be positioned at SOCCER reference
       
        SQ 2. UCL Champions league or World Cup
        if (UCL is picked){
            //Ask the user to pick 
            //between two teams:
            REAL MADRID or AC. MILAN
            if (RM is picked){
               Ask questions related to RM UCLs campaigns over the years
               # Favorite championship campaign
               # Favorite player
               # Favorite goal
               # etc...
            }else{
                Ask questions related to ACM 
                UCLs campaigns over the years
                as previously done
            }
        } else{
            //World Cup was picked by the user
            //Next ask the user to pick between
            Brazil or Argentina
            if (Brazil is picked){
                Ask about the user to pick between two of
                the best Brazilian players:
                Ronaldo De Lima or Ronaldinho
                if(Ronaldo){
                    ask the user to choose between
                    Ronaldo skillset:
                    Goals or Dribbles
                }else{
                    //Ask about Ronaldinho skillset
                    Dribbles or freestyle
                }
            } else{
              Ask the user to pick between Messi or Diego Maradona
              if (Messi){
                Ask a question about Messi
                where the user has to choose between
                two choices
              }
            }
        }
    } else {
        Go with BASKETBALL questions
    }
 */