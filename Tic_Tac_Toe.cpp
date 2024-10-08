//Find Winner on a Tic Tac Toe Game
#include <vector>
#include <string>
#include <unordered_map>

using namespace std;

class Solution {
public:
    string tictactoe(vector<vector<int>>& moves) {
        vector<int> rows(3), cols(3);
        int diag = 0, antiDiag = 0;
        unordered_map<int, char> players{{0, 'A'}, {1, 'B'}};
        
        for (int i = 0; i < moves.size(); ++i) {
            int row = moves[i][0];
            int col = moves[i][1];
            int player = i % 2;
            
            rows[row] += (player == 0) ? 1 : -1;
            cols[col] += (player == 0) ? 1 : -1;
            if (row == col) diag += (player == 0) ? 1 : -1;
            if (row + col == 2) antiDiag += (player == 0) ? 1 : -1;
            
            if (abs(rows[row]) == 3 || abs(cols[col]) == 3 ||
                abs(diag) == 3 || abs(antiDiag) == 3) {
                return string(1, players[player]);
            }
        }
        
        return (moves.size() < 9) ? "Pending" : "Draw";
    }
};
