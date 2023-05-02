int segmentos[] = {2, 3, 4, 5, 6, 7, 8, 9};
int digitos[][8] = {
  {1,1,1,1,1,1,0,1}, //0
  {0,1,1,0,0,0,0,0}, //1
  {1,1,0,1,1,0,1,0}, //2
  {1,1,1,1,0,0,1,0}, //3
  {0,1,1,0,0,1,1,0}, //4
  {1,0,1,1,0,1,1,0}, //5
  {0,0,1,1,1,1,1,0}, //6
  {1,1,1,0,0,0,0,0}, //7
  {1,1,1,1,1,1,1,0}, //8
  {1,1,1,0,0,1,1,0}, //9
  {0,0,0,0,0,0,0,1}, //.
};

void setup() {
  for(int i = 0; i < 8; i++){
    pinMode(segmentos[i], OUTPUT);
  }
}

void loop() {
  for(int i = 0; i <= 10; i++){
    for(int j = 0; j < 9; j++){
      digitalWrite(segmentos[j], digitos[i][j]);
      delay(10);
    }
    delay(1000);
  }

  for(int i = 9; i > 0; i--){
    for(int j = 7; j >= 0; j--){
      digitalWrite(segmentos[j], digitos[i][j]);
      delay(10);
    }
    delay(1000);
  }
}
