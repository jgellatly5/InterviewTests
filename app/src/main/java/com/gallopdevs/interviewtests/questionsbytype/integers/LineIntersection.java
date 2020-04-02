package com.gallopdevs.interviewtests.questionsbytype.integers;

public class LineIntersection {
    public static class Line {
        private static double epsilon = 0.00001;
        private double slope;
        private double yIntercept;

        public Line(double slope, double yIntercept) {
            this.slope = slope;
            this.yIntercept = yIntercept;
        }

        public boolean intersect(Line line) {
            if (this.equals(line)) return false;
            return Math.abs(slope - line.slope) > epsilon;
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Line)) return false;
            Line line = (Line) o;
            return Math.abs(slope - line.slope) < epsilon
                    && Math.abs(yIntercept - line.yIntercept) < epsilon;
        }
    }
}
