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

  Serial.begin(9600);
  pinMode(A0, INPUT);
}

void loop() {
  int potenciometro = analogRead(A0);
  Serial.println(potenciometro);
  delay(500);

  if(potenciometro <= 10){
    for(int i = 0; i < 9; i++){
      digitalWrite(segmentos[i], digitos[0][i]);
      delay(10);
    }
  }
  else if(potenciometro > 10 & potenciometro <= 100){
    for(int i = 0; i < 9; i++){
      digitalWrite(segmentos[i], digitos[1][i]);
      delay(10);
    }
  }
  else if(potenciometro > 100 & potenciometro <= 200){
    for(int i = 0; i < 9; i++){
      digitalWrite(segmentos[i], digitos[2][i]);
      delay(10);
    }
  }
  else if(potenciometro > 200 & potenciometro <= 300){
    for(int i = 0; i < 9; i++){
      digitalWrite(segmentos[i], digitos[3][i]);
      delay(10);
    }
  }
  else if(potenciometro > 300 & potenciometro <= 400){
    for(int i = 0; i < 9; i++){
      digitalWrite(segmentos[i], digitos[4][i]);
      delay(10);
    }
  }
  else if(potenciometro > 400 & potenciometro <= 500){
    for(int i = 0; i < 9; i++){
      digitalWrite(segmentos[i], digitos[5][i]);
      delay(10);
    }
  }
  else if(potenciometro > 500 & potenciometro <= 600){
    for(int i = 0; i < 9; i++){
      digitalWrite(segmentos[i], digitos[6][i]);
      delay(10);
    }
  }
  else if(potenciometro > 600 & potenciometro <= 700){
    for(int i = 0; i < 9; i++){
      digitalWrite(segmentos[i], digitos[7][i]);
      delay(10);
    }
  }
  else if(potenciometro > 700 & potenciometro <= 800){
    for(int i = 0; i < 9; i++){
      digitalWrite(segmentos[i], digitos[8][i]);
      delay(10);
    }
  }
  else if(potenciometro > 800 & potenciometro <= 900){
    for(int i = 0; i < 9; i++){
      digitalWrite(segmentos[i], digitos[9][i]);
      delay(10);
    }
  }
  else{
    for(int i = 0; i < 9; i++){
      digitalWrite(segmentos[i], digitos[10][i]);
      delay(100);
    }
  }

}
