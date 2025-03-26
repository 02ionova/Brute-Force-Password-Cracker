package cz.cvut.fel.pjv;

public class BruteForceAttacker extends Thief {

    @Override
    public void breakPassword(int sizeOfPassword) {
        char[] characters = getCharacters();
        char[] attempt = new char[sizeOfPassword];
        bruteForce(attempt, characters, 0);
    }

    private boolean bruteForce(char[] attempt, char[] characters, int position) {
        if (position == attempt.length) {
            return tryOpen(attempt);
        }

        for (char c : characters) {
            attempt[position] = c;
            if (bruteForce(attempt, characters, position + 1)) {
                return true;
            }
        }

        return false;
    }
}
