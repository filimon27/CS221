package Assignment5;

import java.util.ArrayList;
import java.util.Arrays;

    public class Student implements Comparable<Student> {
        private int sId;
        private String sName;
        private int score;
        public Student(int sId,String sName,int score) {
            this.sId=sId;
            this.sName=sName;
            this.score=score;
        }
        public int getScore() {
            return this.score=score;
        }
        public String getSName() {
            return this.sName=sName;
        }
        public int getSId() {
            return this.sId=sId;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Student other = (Student) obj;
            if (sId != other.sId)
                return false;
            if (sName == null) {
                if (other.sName != null)
                    return false;
            } else if (!sName.equals(other.sName))
                return false;
            if (score != other.score)
                return false;
            return true;
        }
        @Override
        public String toString() {
            return "Student [sId=" + sId + ", sName=" + sName + ", score=" + score + "]";
        }
        @Override
        public int compareTo(Student o) {

            return this.score-o.score;
        }


    }


