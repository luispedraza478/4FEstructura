import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayQueue<Job> queue = new ArrayQueue<>();
        ArrayStack<Job> stack = new ArrayStack<>();
        SinglyLinkedList<Job> log = new SinglyLinkedList<>();
        while (true) {
            System.out.print("Ingresa el comando > ");
            String line = sc.nextLine();
            if (line == null) break;
            line = line.trim();
            if (line.isEmpty()) continue;

            String[] parts = line.split("\\s+");
            String cmd = parts[0].toUpperCase();

            switch (cmd) {
                case "ADD":
                    if (parts.length < 2) {
                        System.out.println("Falta ID de trabajo");
                    } else {
                        String id = parts[1];
                        Job job = new Job(id);
                        queue.offer(job);
                    }
                    break;

                case "PROCESS":
                    if (parts.length < 2) {
                        System.out.println("Falta número para PROCESS");
                    } else {
                        int n;
                        try {
                            n = Integer.parseInt(parts[1]);
                            if (n < 0) {
                                System.out.println("Número inválido");
                                break;
                            }
                        } catch (NumberFormatException ex) {
                            System.out.println("Número inválido");
                            break;
                        }
                        int count = 0;
                        while (!queue.isEmpty() && count < n) {
                            Job j = queue.poll();
                            if (j != null) {
                                stack.push(j);
                                count++;
                            } else break;
                        }
                    }
                    break;

                case "COMMIT":
                    while (!stack.isEmpty()) {
                        Job j = stack.pop();
                        if (j != null) log.addLast(j);
                    }
                    break;

                case "ROLLBACK":
                    if (parts.length < 2) {
                        System.out.println("Falta número para ROLLBACK");
                    } else {
                        int m;
                        try {
                            m = Integer.parseInt(parts[1]);
                            if (m < 0) {
                                System.out.println("Número inválido");
                                break;
                            }
                        } catch (NumberFormatException ex) {
                            System.out.println("Número inválido");
                            break;
                        }
                        Object[] removed = log.removeLastMultiple(m); 
                        for (int i = removed.length - 1; i >= 0; i--) {
                            @SuppressWarnings("unchecked")
                            Job job = (Job) removed[i];
                            queue.offerFront(job);
                        }
                    }
                    break;
                    case "PRINT":
                    System.out.println("Queue (front -> rear):");
                    queue.print();
                    System.out.println("Stack (bottom -> top):");
                    stack.print();
                    System.out.println("Bitácora (head -> tail):");
                    log.printList();
                    break;
                    case "END":
                    System.out.println("=== ESTADO FINAL ===");
                    System.out.println("QUEUE (pendientes):");
                    queue.print();
                    System.out.println("STACK (procesando):");
                    stack.print();
                    System.out.println("BITÁCORA (confirmados):");
                    log.printList();
                    sc.close();
                    return;

                default:
                    System.out.println("Comando no reconocido");
            }
        }
    }
}
