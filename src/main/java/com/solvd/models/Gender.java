package com.solvd.models;

public enum Gender {

        M("Male"),

        F("Female"),
        /** Gender is not known, or not specified. */
        UNKNOWN("Unknown");

        private final String name;

        private Gender(String name) {
            this.name = name;
        }


        public String getName() {
            return this.name;
        }

}
