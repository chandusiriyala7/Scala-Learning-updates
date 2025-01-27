package Lectures.part2oops

object Enums
{
  enum Permissions {
    case READ, WRITE, EXECUTE, NONE

    //add fields or methods
    def openDocument(): Unit =
      if(this == READ) println("Opening Document")
      else println("Printing not allowed")

  }
  val somePermissions: Permissions = Permissions.READ


  //constructor arguments

  enum PermissionsWithBits(bits:Int) {
    case READ extends PermissionsWithBits(4) //100
    case WRITE extends PermissionsWithBits(2) //010
    case EXECUTE extends PermissionsWithBits(1) //001
    case NONE extends PermissionsWithBits(0) // 000
  }

  object PermissionsWithBits {

    def fromBits(bits:Int) : PermissionsWithBits = //whatever
    PermissionsWithBits.NONE

  }

  //standard API
  val somePermissionsOrdinal = somePermissions.ordinal
  val allPermissions = PermissionsWithBits.values //array of all possible values of the Enum
  val readPermission : Permissions = Permissions.valueOf("READ")  //Permissions.READ


  def main(args:Array[String]) : Unit = {
    somePermissions.openDocument()
  }
}
