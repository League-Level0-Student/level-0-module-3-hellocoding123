
void setup() {
 
  size(200,200);
  
}

void draw() {
  color c1 = color(0,0,0);
  color c2 = color(255,0,0);
  int size = 95;
  fill(c2);
  
  for(int i = 0; i < 9; i++) {
    if(i % 2 == 0) {
      stroke(c1);
      strokeWeight(10);
    }
    else {
      stroke(c2);
    }
  ellipse(100,100,size-10,size-10); 
  size-=10;
  }
  
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}
