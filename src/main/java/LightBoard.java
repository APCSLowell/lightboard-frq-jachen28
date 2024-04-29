public class LightBoard
{
  /** The lights on the board, where true represents on and false represents off.
   */
  private boolean[][] lights;

  /** Constructs a LightBoard object having numRows rows and numCols columns.
   * Precondition: numRows > 0, numCols > 0
   * Postcondition: each light has a 40% probability of being set to on.
   */
  public LightBoard(int numRows, int numCols)
  {
    lights = new boolean[numRows][numCols];

for(int i = 0; i < numRows; i++){
  for(int j = 0; j < numCols; j++){
  int r = Math.random();
  lights[i][j] = r < 0.4;

  }

  /** Evaluates a light in row index row and column index col and returns a status
   *  as described in part (b).
   *  Precondition: row and col are valid indexes in lights.
   */
  public boolean evaluateLight(int row, int col)
  {
   int sum = 0;
    for(int r = 0; r < lights.length; i++)
      {
        if(lights[r][col])
          sum++;
      }

    if(lights[r][col] && sum % 2 == 0)
return true;
if(!lights[r][col] && sum % 3 == 0)
return false;

return lights[r][col];
   
 
  }
  public boolean[][] getLights()
  {
    return lights;
  }
  //used for testing
  public String toString()
  {
    String s = "";
    for (int r = 0; r < lights.length; r++)
    {
      for (int c = 0; c < lights[0].length; c++)
        if (lights[r][c])
          s += "*";
        else
          s += ".";
      s += "\n";
    }
    return s;
  }
  
}
