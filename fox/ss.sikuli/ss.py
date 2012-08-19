###global###
ascene_idtoname = ['炽光城', '精灵之森', '晶核峡谷'];
ascene_map = ["fFI1IF1.png", "egg.png", "mziFTE.png"];
screen_width = 1070;
screen_height = 695;

try_times = 6;

###global func###
def ShowMap():
    i = 0;
    while not exists("1345304847470.png") and i < try_times:
        type("m");
        sleep(1);
        i = i + 1;


def HideMap():
    i = 0;
    while exists("1345304847470.png") and i < try_times:
        type("m");
        sleep(1);
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
    i = 0;
    for map in ascene_map:
        if Region(Region(917,110,110,44)).exists(map):
            return i;
        i = i + 1;
    return -1;
    
###doudou###
def GotoNPC():
    ShowMap();
    ps = exists("I.png");
    if not ps:
        return -8
    ps = ps.inside().exists(Pattern("Bidz.png").targetOffset(-20, -20));    
    if not ps:
        return -11
    doubleClick(ps);
    HideMap();

def EnterDouDou():
    ps = exists("Y.png");
    if not ps:
        return -1;

    click(ps);
    sleep(1);
    click("ifkikhlli.png");
    sleep(1);
    click("1345350626806.png");
    

def findAndAttack(pic):
    dg = exists(pic)
    if dg:
        doubleClick(dg)        
        sleep(12)      
        return 1
    else:
        return 0

def attack(picList):
    iRet = 0
    for pic in picList:
        iRet = iRet + findAndAttack(pic)

    return iRet


def attackRed():
    picList = ["r1.PNG","r2.PNG","r3.PNG","r4.PNG","r5.PNG","r6.PNG","1.PNG","2.PNG","4.PNG","5.PNG","6.PNG","7.PNG","b1.PNG","b2.PNG","b3.PNG"]
    return attack(picList)


def StartDaDouDou():
    ps = exists(Pattern("1345353430259.png").targetOffset(0, -80));
    if ps:
        doubleClick(ps);

    attackRed();
    
    

def DaDouDou():
    currentScene = GetSceneID();
    if (currentScene != 1):
        Transport(1);
    GotoNPC();
    EnterDouDou();
    

###main###
safari = App('Safari');
safari.focus();
sleep(2);


