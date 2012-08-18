###global###
ascene_idtoname = ['炽光城', '精灵之森', '晶核峡谷'];
ascene_map = ["1345299825199.png", "1345299852172.png", "fiEEF7.png"];
screen_width = 1070;
screen_height = 695;

try_times = 6;

###func###
def ShowMap():
    i = 0;
    while not exists("1345304847470.png") and i < try_times:
        type("m");
        i = i + 1;


def HideMap():
    i = 0;
    while exists("1345304847470.png") and i < try_times:
        type("m");
        i = i + 1;
        

def TransportToScene(map):
    CastSkill(5);
    target = exists(map);
    if target:
        click(target);
        pic = exists("1345303939164.png");
        if pic:
            click(pic);


def Transport(sceneID):
    ascene_transport = ["1345304481978.png", "1345303983948.png", "EHZi.png"];
    TransportToScene(ascene_transport[sceneID]);


def CastSkill(skillNum):
            
    type(str(skillNum));
        
    
def GetSceneID():
    #if map not on, show map
    ShowMap();
    
    i = 0;
    for map in ascene_map:
        if exists(map):
            HideMap();
            return i;
        i = i + 1;

    HideMap();
    return -1;
    


###main###
safari = App('Safari');
safari.focus();
sceneId = GetSceneID();
Transport(1);
sleep(2);
Transport(0);
sleep(2);
Transport(2);



