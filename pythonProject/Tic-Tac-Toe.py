#Bu fonksiyon, kullanıcı dönüşü her geldiğinde kartın mevcut durumunu çizmek için kullanılır.
def ConstBoard(board):
    print("Tahtanın Mevcut Durumu: \n\n");
    for i in range (0,9):
        if((i>0) and (i%3)==0):
            print("\n");
        if(board[i]==0):
            print("- ",end=" ");
        if (board[i]==1):
            print("O ",end=" ");
        if(board[i]==-1):    
            print("X ",end=" ");
    print("\n\n");

#Bu fonksiyon, kullanıcıyı girdi olarak hareket ettirir ve tahtada gerekli değişiklikleri yapar.
def User1Turn(board):
    pos=input("[1...9]'dan X'in konumunu girin: ");
    pos=int(pos);
    if(board[pos-1]!=0):
        print("Yanlış Hamle !!!");
        exit(0) ;
    board[pos-1]=-1;

def User2Turn(board):
    pos=input("[1...9]'dan O'nun konumunu girin: ");
    pos=int(pos);
    if(board[pos-1]!=0):
        print("Yanlış Hamle !!!");
        exit(0);
    board[pos-1]=1;

#MinMax function.
def minimax(board,player):
    x=analyzeboard(board);
    if(x!=0):
        return (x*player);
    pos=-1;
    value=-2;
    for i in range(0,9):
        if(board[i]==0):
            board[i]=player;
            score=-minimax(board,(player*-1));
            if(score>value):
                value=score;
                pos=i;
            board[i]=0;

    if(pos==-1):
        return 0;
    return value;
    
#Bu işlev, bilgisayarın minimax algoritmasını kullanarak hareket etmesini sağlar.
def CompTurn(board):
    pos=-1;
    value=-2;
    for i in range(0,9):
        if(board[i]==0):
            board[i]=1;
            score=-minimax(board, -1);
            board[i]=0;
            if(score>value):
                value=score;
                pos=i;
 
    board[pos]=1;


#Bu fonksiyon oyunu analiz etmek için kullanılır.
def analyzeboard(board):
    cb=[[0,1,2],[3,4,5],[6,7,8],[0,3,6],[1,4,7],[2,5,8],[0,4,8],[2,4,6]];

    for i in range(0,8):
        if(board[cb[i][0]] != 0 and
           board[cb[i][0]] == board[cb[i][1]] and
           board[cb[i][0]] == board[cb[i][2]]):
            return board[cb[i][2]];
    return 0;

#Main Function.
def main():
    choice=input("Tek oyuncu için 1, çok oyuncu için 2 girin : ");
    choice=int(choice);
    #Board, tek boyutlu bir dizi şeklinde kabul edilir.
    #Bir oyuncu 1, diğer oyuncu -1 hamle yapar.
    board=[0,0,0,0,0,0,0,0,0];
    if(choice==1):
        print("Bilgisayar : O Vs. Kullanıcı : X ");
        player= input("1. veya 2. oynamak için girin:");
        player = int(player);
        for i in range (0,9):
            if(analyzeboard(board)!=0):
                break;
            if((i+player)%2==0):
                CompTurn(board);
            else:
                ConstBoard(board);
                User1Turn(board);
    else:
        for i in range (0,9):
            if(analyzeboard(board)!=0):
                break;
            if((i)%2==0):
                ConstBoard(board);
                User1Turn(board);
            else:
                ConstBoard(board);
                User2Turn(board);
         

    x=analyzeboard(board);
    if(x==0):
         ConstBoard(board);
         print("Beraberlik!!!")
    if(x==-1):
         ConstBoard(board);
         print("X Kazandı!!! Y Kaybetti !!!")
    if(x==1):
         ConstBoard(board);
         print("X Kaybetti!!! O Kazandı !!!!")
       
main()