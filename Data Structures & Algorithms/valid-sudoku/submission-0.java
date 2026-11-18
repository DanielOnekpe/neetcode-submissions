class Solution {
    public boolean isValidSudoku(char[][] board) {
        // check all rows
        for(int i = 0; i < 9; i++){
            HashSet<Character> seen = new HashSet<>();
            for(int j = 0; j < 9; j++){
                char val = board[i][j];
                if(val == '.'){
                    continue;
                }

                if(seen.contains(val)){
                    return false;
                }

                seen.add(val);
            }
        }

        // check all columns
        for(int j = 0; j < 9; j++){
            HashSet<Character> seen = new HashSet<>();
            for(int i = 0; i < 9; i++){
                char val = board[i][j];
                if(val == '.'){
                    continue;
                }

                if(seen.contains(val)){
                    return false;
                }

                seen.add(val);
            }
        }

        for(int boxRow = 0; boxRow < 3; boxRow++){
            for(int boxCol = 0; boxCol < 3; boxCol++){
                HashSet<Character> seen = new HashSet<>();
                for(int r = 0; r < 3; r++){
                    for(int c = 0; c < 3; c++){
                        int row = boxRow * 3 + r;
                        int col = boxCol * 3 + c;

                        char val = board[row][col];
                        if(val == '.'){
                            continue;
                        }

                        if(seen.contains(val)){
                            return false;
                        }

                        seen.add(val);
                    }
                }
            }
        }

        return true;
    }
}
