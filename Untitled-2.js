import * as THREE from 'three';
import { OrbitControls } from 'three/examples/jsm/controls/OrbitControls';
//1 scene
const scene = new THREE.Scene();

//2 camera
const camera = new THREE.PerspectiveCamera(70, window.innerWidth / window.innerHeight, 0.1, 1000);
camera.position.z = 70;

//3 renderer
const renderer = new THREE.WebGLRenderer();
renderer.setSize(window.innerWidth, window.innerHeight)
document.body.appendChild(renderer.domElement)

//4 orbitcontrols
new OrbitControls(camera, renderer.domElement);

//5
// Geometries
const cubeGeometry = new THREE.BoxGeometry(10, 10, 10);
const circleGeometry = new THREE.CircleGeometry(5,32)
const tubeGeometry = new THREE.TubeGeometry();
const torusGeometry = new THREE.TorusKnotGeometry( 10, 3, 100, 16 );
const capsuleGeometry = new THREE.CapsuleGeometry(5,2,30,64)
const sphereGeometry = new THREE.SphereGeometry(5,32,32,)
const octahedraonGeometry = new THREE.OctahedronGeometry(4);
const dedocahedronGeometry = new THREE.DodecahedronGeometry(4);
const ringGeometry = new THREE.RingGeometry( 1, 5, 32 );
// const geometry = new THREE.ShapeGeometry(shape);

// const customGeomtry = new THREE.StarGeometry()


function createCustomStarShape(scale: number) {
  const shape = new THREE.Shape();
  
  shape.moveTo(1 * scale, 7 * scale);
  shape.lineTo(3 * scale, 7 * scale);
  shape.lineTo(4 * scale, 9 * scale);
  shape.lineTo(5 * scale, 7 * scale);
  shape.lineTo(7 * scale, 7 * scale);
  shape.lineTo(5.5 * scale, 6 * scale);
  shape.lineTo(7 * scale, 3 * scale);
  shape.lineTo(3.5 * scale, 5 * scale);
  shape.lineTo(1 * scale, 3 * scale);
  shape.lineTo(2 * scale, 6 * scale);

  shape.closePath();

  const geometry = new THREE.ShapeGeometry(shape);
  return geometry;
}

// When creating the custom star, pass in a scale factor:
const customGeometry = createCustomStarShape(3); 

let objects : THREE.Mesh[]=[];

//function to create object
function createMesh(geometry:THREE.BufferGeometry,material:THREE.MeshBasicMaterial){
const mesh=new THREE.Mesh(geometry,material)
mesh.position.setX(THREE.MathUtils.randFloatSpread(100))
mesh.position.setY(THREE.MathUtils.randFloatSpread(100))
mesh.position.setZ(THREE.MathUtils.randFloatSpread(100))
mesh.scale.set(0.5,0.6,0.7);

scene.add(mesh)
objects.push(mesh)
}

// creating actually objects
for (let i=0;i<500;i++){
  const material = new THREE.MeshBasicMaterial({color:0xff0000*Math.random()});
  if(i<50)
    {
      createMesh(cubeGeometry,material)
    }
    else if(i>=50 && i<100)
    {
      createMesh(tubeGeometry,material)
    }
    else if(i>=100 && i<150)
    {
      createMesh(torusGeometry,material)
    }
    else if(i>=150 && i<200)
    {
      createMesh(capsuleGeometry,material)
    }
    else if(i>=200 && i<250)
    {
      createMesh(sphereGeometry,material)
    }
    else if(i>=250 && i<300)
    {
      createMesh(octahedraonGeometry,material)
    }
      else if(i>=300 && i<350)
    {
      createMesh(ringGeometry,material)
    }
      else if(i>=350 && i<400)
    {
      createMesh(dedocahedronGeometry,material)
    }
    else if (i >= 400 && i < 450) {
      const customGeometry = createCustomStarShape(3); // Call the function to get the geometry
      createMesh(customGeometry, material); // Pass the geometry to createMesh
  }
}
//axes helper
const axisControl = new THREE.AxesHelper(100);
scene.add(axisControl);


window.addEventListener('resize', onWindowResize, false)
function onWindowResize() {
  camera.aspect = window.innerWidth / window.innerHeight
  camera.updateProjectionMatrix()
  renderer.setSize(window.innerWidth, window.innerHeight)
  renderer.render(scene, camera)
}

function animate() {
  requestAnimationFrame(animate);
  // for (let j=0;j<450;j++)
  // {
  //   objects[j].rotateX(0.01)
  //   objects[j].rotateY(0.01)
  //   objects[j].rotateZ(0.01)
  //   objects[j].scale.set(4,3,2);
  //   objects[j].scale.set(THREE.MathUtils.randFloatSpread(2),THREE.MathUtils.randFloatSpread(2),THREE.MathUtils.randFloatSpread(2))
  // }
  

  // scene.rotateX(0.005)
  // scene.rotateY(0.005)
  // scene.rotateZ(0.005)
  renderer.render(scene, camera)
  
}

animate()
