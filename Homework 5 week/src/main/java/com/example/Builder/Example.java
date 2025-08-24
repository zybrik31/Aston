package com.example.Builder;

public class Example<T> {
    protected String name;
    protected T data;

    public Example(BuilderEx<T> builder) {
        this.name = builder.name;
        this.data = builder.data;
    }

    public static class BuilderEx<T> {

        private String name;
        private T data;

        public BuilderEx(String name) {
            this.name = name;
        }

        public BuilderEx<T> append(T add) {
            if (this.data == null) {
                this.data = add;
                return this;
            }
            if (add instanceof String) {
                this.data = (T) (this.data + " " + add.toString());
                return this;
            }
            if (add instanceof Integer) {
                this.data = (T) Integer.valueOf((int) (this.data) + (int) add);
            } else if (add instanceof Double) {
                this.data = (T) Double.valueOf((double) (this.data) + (double) add);
            } else if (add instanceof Float) {
                this.data = (T) Float.valueOf((float) (this.data) + (float) add);
            } else if (add instanceof Long) {
                this.data = (T) Long.valueOf((long) (this.data) + (long) add);
            }
            return this;
        }

        public Example<T> build() {
            return new Example<>(this);
        }
    }
    public void getName() {
        System.out.println(this.name);
    }

    public void getData() {
        System.out.println(this.data);
    }

    public Example<T> append(T add) {
        if (this.data == null) {
            this.data = add;
            return this;
        }
        if (add instanceof String) {
            this.data = (T) (this.data + " " + add.toString());
            return this;
        }
        if (add instanceof Integer) {
            this.data = (T) Integer.valueOf((int) (this.data) + (int) add);
        } else if (add instanceof Double) {
            this.data = (T) Double.valueOf((double) (this.data) + (double) add);
        } else if (add instanceof Float) {
            this.data = (T) Float.valueOf((float) (this.data) + (float) add);
        } else if (add instanceof Long) {
            this.data = (T) Long.valueOf((long) (this.data) + (long) add);
        }
        return this;
    }
}
