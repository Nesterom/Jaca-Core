package com.test.Lesson7;

public enum Models {
    KAROQ (Lable.SKODA),
    KADIAQ (Lable.SKODA),
    A180 (Lable.MERSEDES),
    B200 (Lable.MERSEDES),
    RIO (Lable.KIA),
    RioX (Lable.KIA);
    private Lable lable;

    Models (Lable lable) {
        this.lable = lable;
    }

    public Models[] getModelsList (Lable lable) {
        int count = 0;
        for (int i = 0; i < Models.values ().length; i++) {
            if (lable == Models.values ()[i].lable) {
                count++;
            }
        }
            Models[] selectedModels = new Models[count];
            for (int i = 0, j = 0; i < Models.values ().length; i++) {
                if (lable == Models.values ()[i].lable) {
                    selectedModels[j] = Models.values ()[i];
                    j++;
                }
            }
            return selectedModels;

        }
    }








