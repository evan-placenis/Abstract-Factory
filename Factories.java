class Maze {
    public void addRoom(Room room){
        System.out.println("Room "+ Integer.toString(room.roomNum) + " constructing");
   }
}
//-----------------------------------------------------
class MazeFactory {
   public Maze MakeMaze(){
        return new Maze();
   }
   public Wall MakeWall(){
        return new Wall();
   }
   public Room MakeRoom(int n){
        return new Room(n);
   }
   public Door MakeDoor(Room r1, Room r2){
        return new Door(r1, r2);
   }

}
//-----------------------------------------------------
class EnchantedMazeFactory extends MazeFactory{

   public Room MakeRoom(int n){
        return new EnchantedRoom(n);
   }
   public Door MakeDoor(Room r1, Room r2){
        return new EnchantedDoor(r1, r2);
   }

   protected void CastSpell(){
        System.out.println("Spell has been casted in the maze");
   }
}
//-----------------------------------------------------
class BombedMazeFactory extends MazeFactory{
    public Wall MakeWall(){
        return new BombedWall();
    }

    public Room MakeRoom(int n){
        return new RoomWithABomb(n);
    }
}

