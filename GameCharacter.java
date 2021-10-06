public class GameCharacter {
        private int lifePoint = 100;
        private int attackHitPoint;
        private int attackKickPoint;
        private String name;

        public GameCharacter(String name, int attackHitPoint, int attackKickPoint) {
            this.name = name;
            this.attackHitPoint = attackHitPoint;
            this.attackKickPoint = attackKickPoint;
        }

        public String getName() {
            return name;
        }

        public int getLifePoint() {
            return lifePoint;
        }

        public void setLifePoint(int lifePoint) {
            this.lifePoint = lifePoint;
        }

        public void kick(GameCharacter character) {
            character.setLifePoint(character.getLifePoint() - this.attackKickPoint);
        }

        public void hit(GameCharacter character) {
            character.setLifePoint(character.getLifePoint() - this.attackHitPoint);
        }

        public void compare(GameCharacter character) {
            int result = Integer.compare(this.lifePoint, character.getLifePoint());
            if (result>0) {
                System.out.println("Pemenangnya adalah " + this.name  );
            } else if (result<0) {
                System.out.println("pemenangnya adalah " + character.getName());
            } else {
                System.out.println("draw");
            }
        }
}
